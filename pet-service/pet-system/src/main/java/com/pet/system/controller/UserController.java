package com.pet.system.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.pet.common.response.BaseResponse;
import com.pet.common.response.ResultUtils;
import com.pet.system.model.dto.LoginUserInfo;
import com.pet.system.model.request.UserLoginReq;
import com.pet.system.model.request.UserRegisterReq;
import com.pet.system.service.TSysUserService;
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
    private TSysUserService sysUserService;

    @ApiOperation(value = "用户注册")
    @PutMapping("/register")
    public BaseResponse<Boolean> register(@RequestBody @Valid UserRegisterReq request) {
        return ResultUtils.success(sysUserService.register(request));
    }

    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public BaseResponse<LoginUserInfo> login(@RequestBody @Valid UserLoginReq request) {
        return ResultUtils.success(sysUserService.login(request));
    }

    @ApiOperation(value = "注销")
    @PostMapping("/logout")
    public BaseResponse<Boolean> logout() {
        StpUtil.logout();
        return ResultUtils.success(true);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @PostMapping("/currInfo")
    public BaseResponse<LoginUserInfo> getCurrUser() {
        return ResultUtils.success(sysUserService.getCurrUserInfo());
    }
}
