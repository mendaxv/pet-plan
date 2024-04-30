package com.pet.system.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pet.common.response.BaseResponse;
import com.pet.common.response.ResultUtils;
import com.pet.system.model.dto.LoginUserInfo;
import com.pet.system.model.entity.User;
import com.pet.system.model.request.UserLoginRequest;
import com.pet.system.model.request.UserPageSearchRequest;
import com.pet.system.model.request.UserRegisterRequest;
import com.pet.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author zw
 * @date 2024/1/24 14:25
 * @description 用户相关接口
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户管理")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "用户注册")
    @PutMapping("/register")
    public BaseResponse<Integer> register(@RequestBody @Valid UserRegisterRequest request) {
        return ResultUtils.success(userService.register(request));
    }

    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public BaseResponse<Integer> login(@RequestBody @Valid UserLoginRequest request) {
        return ResultUtils.success(userService.login(request));
    }

    @ApiOperation(value = "注销")
    @PostMapping("/logout")
    public BaseResponse<Void> logout() {
        StpUtil.logout();
        return ResultUtils.success();
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @PostMapping("/currUserInfo")
    public BaseResponse<LoginUserInfo> getCurrUser() {
        return ResultUtils.success(userService.getCurrUserInfo());
    }

    @GetMapping
    @ApiOperation(value = "获取用户列表")
    public BaseResponse<Page<User>> listUser(@RequestBody UserPageSearchRequest param) {
        return ResultUtils.success(userService.listUser(param));
    }
}
