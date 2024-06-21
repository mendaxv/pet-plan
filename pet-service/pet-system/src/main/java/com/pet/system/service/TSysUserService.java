package com.pet.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pet.system.model.dto.LoginUserInfo;
import com.pet.system.model.dto.SysUserDto;
import com.pet.system.model.entity.TSysUser;
import com.pet.system.model.request.UserLoginReq;
import com.pet.system.model.request.UserPageSearchReq;
import com.pet.system.model.request.UserRegisterReq;

/**
* @author Administrator
* @description 针对表【t_sys_user(用户表)】的数据库操作Service
* @createDate 2024-06-19 20:20:31
*/
public interface TSysUserService extends IService<TSysUser> {

    /**
     * 用户注册
     *
     * @param request 请求入参
     * @return
     */
    Boolean register(UserRegisterReq request);

    /**
     * 用户登录
     *
     * @param request 请求入参
     * @return
     */
    LoginUserInfo login(UserLoginReq request);

    /**
     * 分页查询用户列表
     *
     * @param request 请求入参
     * @return
     */
    Page<SysUserDto> listUser(UserPageSearchReq request);

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
}
