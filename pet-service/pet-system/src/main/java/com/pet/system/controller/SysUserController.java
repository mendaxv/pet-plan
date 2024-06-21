package com.pet.system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pet.common.response.BaseResponse;
import com.pet.common.response.ResultUtils;
import com.pet.system.model.dto.SysUserDto;
import com.pet.system.model.request.UserPageSearchReq;
import com.pet.system.service.TSysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zw
 * @date 2024/6/20 19:55
 * @description 系统设置-用户管理
 */
@RestController
@RequestMapping("/sys/user")
@Api(value = "系统设置-用户管理")
public class SysUserController {

    @Resource
    private TSysUserService sysUserService;

    @GetMapping
    @ApiOperation(value = "获取用户列表")
    public BaseResponse<Page<SysUserDto>> listUser(@RequestBody UserPageSearchReq param) {
        return ResultUtils.success(sysUserService.listUser(param));
    }

}
