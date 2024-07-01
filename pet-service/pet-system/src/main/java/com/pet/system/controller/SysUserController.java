package com.pet.system.controller;

import cn.dev33.satoken.annotation.SaCheckRole;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pet.common.response.BaseResponse;
import com.pet.common.response.ResultUtils;
import com.pet.system.model.dto.SysUserDto;
import com.pet.system.model.entity.TSysUser;
import com.pet.system.model.request.UserPageSearchReq;
import com.pet.system.service.TSysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zw
 * @date 2024/6/20 19:55
 * @description 系统设置-用户管理
 */
@RestController
@RequestMapping("/system/user")
@Api(value = "系统设置-用户管理")
public class SysUserController {

    @Resource
    private TSysUserService sysUserService;

    @GetMapping
    @ApiOperation(value = "用户列表分页查询")
    public BaseResponse<Page<SysUserDto>> listUser(@RequestBody UserPageSearchReq req) {
        return ResultUtils.success(sysUserService.pageSearchUser(req));
    }

    @PostMapping
    @ApiOperation(value = "添加用户")
    @SaCheckRole(value = {"admin"})
    public BaseResponse<Boolean> add(@RequestBody SysUserDto sysUserDto) {
        return ResultUtils.success(sysUserService.add(sysUserDto));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除用户")
    @SaCheckRole(value = {"admin"})
    public BaseResponse<Boolean> delete(@PathVariable("id") Long id) {
        return ResultUtils.success(sysUserService.removeById(id));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "用户详情")
    public BaseResponse<SysUserDto> detail(@PathVariable("id") Long id) {
        return ResultUtils.success(sysUserService.detail(id));
    }

    @PutMapping
    @ApiOperation(value = "编辑用户")
    @SaCheckRole(value = {"admin"})
    public BaseResponse<Boolean> edit(@RequestBody TSysUser tSysUser) {
        return ResultUtils.success(sysUserService.updateById(tSysUser));
    }
}
