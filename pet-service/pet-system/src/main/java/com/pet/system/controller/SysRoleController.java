package com.pet.system.controller;

import cn.dev33.satoken.annotation.SaCheckRole;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pet.common.response.BaseResponse;
import com.pet.common.response.ResultUtils;
import com.pet.system.model.dto.SysRoleDto;
import com.pet.system.model.entity.TSysRole;
import com.pet.system.model.request.RolePageSearchReq;
import com.pet.system.service.TSysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zw
 * @date 2024/6/19 19:24
 * @description 系统设置-角色管理
 */
@RestController
@RequestMapping("/system/user")
@Api(value = "系统设置-角色管理")
public class SysRoleController {

    @Resource
    private TSysRoleService sysRoleService;

    @GetMapping
    @ApiOperation(value = "角色列表分页查询")
    public BaseResponse<Page<SysRoleDto>> listUser(@RequestBody RolePageSearchReq req) {
        return ResultUtils.success(sysRoleService.pageSearchRole(req));
    }

    @PostMapping
    @ApiOperation(value = "添加角色")
    @SaCheckRole(value = {"admin"})
    public BaseResponse<Boolean> add(@RequestBody TSysRole tSysRole) {
        tSysRole.setId(null);
        return ResultUtils.success(sysRoleService.save(tSysRole));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除用户")
    @SaCheckRole(value = {"admin"})
    public BaseResponse<Boolean> delete(@PathVariable("id") Long id) {
        return ResultUtils.success(sysRoleService.removeById(id));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "角色详情")
    public BaseResponse<SysRoleDto> detail(@PathVariable("id") Long id) {
        return ResultUtils.success(sysRoleService.detail(id));
    }


}
