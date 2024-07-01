package com.pet.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pet.system.model.dto.LoginUserInfo;
import com.pet.system.model.dto.SysUserDto;
import com.pet.system.model.entity.TSysUser;
import com.pet.system.model.request.UserLoginReq;
import com.pet.system.model.request.UserPageSearchReq;

/**
* @author Administrator
* @description 针对表【t_sys_user(用户表)】的数据库操作Service
* @createDate 2024-06-19 20:20:31
*/
public interface TSysUserService extends IService<TSysUser> {

    /**
     * 用户登录
     *
     * @param req 请求入参
     * @return
     */
    LoginUserInfo login(UserLoginReq req);

    /**
     * 分页查询用户列表
     *
     * @param req 请求入参
     * @return
     */
    Page<SysUserDto> pageSearchUser(UserPageSearchReq req);

    /**
     * 添加用户
     *
     * @param sysUserDto
     * @return
     */
    Boolean add(SysUserDto sysUserDto);

    /**
     * 根据登录账号查找用户
     *
     * @param account 登录账号
     * @return
     */
    TSysUser getByAccount(String account);

    /**
     * 获取当前登录用户信息
     *
     * @return
     */
    LoginUserInfo getCurrUserInfo();

    /**
     * 查询用户详情
     *
     * @param userId 用户ID
     * @return SysUserDto
     */
    SysUserDto detail(Long userId);
}
