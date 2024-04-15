package com.pet.system.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.pet.common.response.ResponseResult;
import com.pet.system.model.LoginParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zw
 * @date 2024/1/30 9:19
 * @description 登录相关
 */
@Api(value = "登录相关")
@RestController
@RequestMapping("/login")
public class LoginController {

    @ApiOperation(value = "登录")
    @RequestMapping("doLogin")
    @ApiImplicitParam()
    public ResponseResult doLogin(@RequestBody LoginParam loginParam) {
        if("admin".equals(loginParam.getUsername()) && "123456".equals(loginParam.getPassword())) {
            StpUtil.login(1);
            return ResponseResult.success("login success");
        }
        return ResponseResult.error("login failure");
    }

    @RequestMapping("/logout")
    public ResponseResult logout() {
        StpUtil.logout();
        return ResponseResult.success();
    }

}
