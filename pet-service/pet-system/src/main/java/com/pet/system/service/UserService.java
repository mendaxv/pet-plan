package com.pet.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pet.system.model.dto.LoginUserInfo;
import com.pet.system.model.entity.User;
import com.pet.system.model.request.UserLoginRequest;
import com.pet.system.model.request.UserPageSearchRequest;
import com.pet.system.model.request.UserRegisterRequest;

/**
* @author Administrator
* @description 针对表【t_user】的数据库操作Service
* @createDate 2024-01-24 15:31:27
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param request 请求入参
     * @return
     */
    Integer register(UserRegisterRequest request);

    /**
     * 用户登录
     *
     * @param request 请求入参
     * @return
     */
    LoginUserInfo login(UserLoginRequest request);

    /**
     * 分页查询用户列表
     *
     * @param request 请求入参
     * @return
     */
    Page<User> listUser(UserPageSearchRequest request);

    /**
     * 根据登录账号查找用户
     *
     * @param account 登录账号
     * @return
     */
    User getByAccount(String account);

    /**
     * 获取当前登录用户信息
     *
     * @return
     */
    LoginUserInfo getCurrUserInfo();
}
