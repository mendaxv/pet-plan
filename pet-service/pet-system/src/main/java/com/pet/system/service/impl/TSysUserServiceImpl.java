package com.pet.system.service.impl;

import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pet.common.exception.BusinessException;
import com.pet.common.response.ResultCode;
import com.pet.system.mapper.TSysUserMapper;
import com.pet.system.mapstract.IUserMapperStruct;
import com.pet.system.model.dto.LoginUserInfo;
import com.pet.system.model.dto.SysUserDto;
import com.pet.system.model.entity.TSysUser;
import com.pet.system.model.enums.UserStatusEnum;
import com.pet.system.model.request.UserLoginReq;
import com.pet.system.model.request.UserPageSearchReq;
import com.pet.system.service.TSysUserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
* @author Administrator
* @description 针对表【t_sys_user(用户表)】的数据库操作Service实现
* @createDate 2024-06-19 20:20:31
*/
@Service
public class TSysUserServiceImpl extends ServiceImpl<TSysUserMapper, TSysUser> implements TSysUserService{

    private static final String SESSION_KEY_USER_INFO = "loginUserInfo";
    private static final String DEFAULT_PASSWORD = "123456";


    @Override
    public LoginUserInfo login(UserLoginReq request) {

        TSysUser user = Optional.ofNullable(this.getByAccount(request.getAccount()))
                .orElseThrow(() -> new BusinessException(ResultCode.LOGIN_ACCOUNT_ERROR));

        // 校验账号密码
        String encryptPassword = SecureUtil.md5(request.getPassword());
        if (!user.getPassword().equals(encryptPassword)) {
            throw new BusinessException(ResultCode.LOGIN_PASSWORD_ERROR);
        }

        // 校验账号状态是否异常
        Integer accountStatus = user.getStatus();
        if (!UserStatusEnum.NORMAL.getCode().equals(accountStatus)) {
            if (UserStatusEnum.FORBID.getCode().equals(user.getStatus())) {
                throw new BusinessException(ResultCode.LOGIN_ACCOUNT_FORBID);
            } else {
                throw new BusinessException(ResultCode.LOGIN_ACCOUNT_FORBID);
            }
        }

        // 会话登录
        StpUtil.login(user.getId());

        // 缓存登录会话信息
        LoginUserInfo loginUserInfo = new LoginUserInfo();
        loginUserInfo.setUserId(user.getId());
        loginUserInfo.setAccount(user.getAccount());
        loginUserInfo.setNickname(user.getNickname());
        SaSession saSession = StpUtil.getSessionByLoginId(user.getId(), true);
        saSession.set(SESSION_KEY_USER_INFO, loginUserInfo);

        return loginUserInfo;
    }

    @Override
    public Page<SysUserDto> pageSearchUser(UserPageSearchReq req) {
        Page<SysUserDto> page = new Page<>(req.getPageNo(), req.getPageSize());
        return this.getBaseMapper().pageUser(page, req);
    }

    @Override
    public Boolean add(SysUserDto sysUserDto) {
        TSysUser tSysUser = new TSysUser();
        tSysUser.setAccount(sysUserDto.getAccount());
        tSysUser.setNickname(sysUserDto.getNickname());
        tSysUser.setPassword(DEFAULT_PASSWORD);
        tSysUser.setPhone(sysUserDto.getPhone());
        tSysUser.setStatus(UserStatusEnum.NORMAL.getCode());
        return this.save(tSysUser);
    }

    @Override
    public TSysUser getByAccount(String account) {
        return this.getOne(Wrappers.<TSysUser>lambdaQuery().eq(TSysUser::getAccount, account), false);
    }

    @Override
    public LoginUserInfo getCurrUserInfo() {
        return (LoginUserInfo) StpUtil.getSession(true).get(SESSION_KEY_USER_INFO);
    }

    @Override
    public SysUserDto detail(Long userId) {
        TSysUser tSysUser = Optional.ofNullable(this.getById(userId))
                .orElseThrow(() -> new BusinessException(ResultCode.LOGIN_ACCOUNT_ERROR));
        return IUserMapperStruct.INSTANCT.entity2Dto(tSysUser);
    }
}




