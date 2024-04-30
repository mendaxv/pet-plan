package com.pet.system.service.impl;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pet.system.mapper.TUserMapper;
import com.pet.system.model.dto.LoginUserInfo;
import com.pet.system.model.entity.User;
import com.pet.system.model.request.UserLoginRequest;
import com.pet.system.model.request.UserPageSearchRequest;
import com.pet.system.model.request.UserRegisterRequest;
import com.pet.system.service.UserService;
import com.pet.system.service.login.UserLoginContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Administrator
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2024-01-24 15:31:27
*/
@Service
public class UserServiceImpl extends ServiceImpl<TUserMapper, User>
    implements UserService {

    @Resource
    private UserLoginContext userLoginContext;

    @Override
    public Page<User> listUser(UserPageSearchRequest param) {
        Page<User> page = new Page<>(param.getPageNo(), param.getPageSize(), true);
        LambdaQueryWrapper<User> queryWrapper = Wrappers.<User>lambdaQuery()
                .like(StrUtil.isNotBlank(param.getUsername()), User::getAccount, param.getUsername())
                .like(StrUtil.isNotBlank(param.getNickname()), User::getNickname, param.getNickname())
                .like(StrUtil.isNotBlank(param.getPhone()), User::getPhone, param.getPhone());
        return this.page(page, queryWrapper);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        User user = new User(userRegisterRequest.getAccount(), userRegisterRequest.getPassword());
        this.save(user);
        return user.getId();
    }

    @Override
    public LoginUserInfo login(UserLoginRequest request) {
        return userLoginContext.login(request);
    }

    @Override
    public User getByAccount(String account) {
        return this.getOne(Wrappers.<User>lambdaQuery().eq(User::getAccount, account));
    }

    @Override
    public LoginUserInfo getCurrUserInfo() {

        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();

        return new LoginUserInfo();
    }
}




