package com.pet.system.controller;

import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pet.common.response.ResponseResult;
import com.pet.system.entity.UserEntity;
import com.pet.system.model.UserPageSearchParam;
import com.pet.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zw
 * @date 2024/1/24 14:25
 * @description 用户管理
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户管理", tags = "用户管理")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    @ApiOperation(value = "获取用户列表")
    public ResponseResult<Page<UserEntity>> listUser(@RequestBody UserPageSearchParam param) {
        return ResponseResult.success(userService.listUser(param));
    }

    @ApiOperation(value = "获取用户", notes = "根据用户ID查询用户")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "int", paramType = "path")
    @GetMapping("/{userId}")
    public ResponseResult<UserEntity> getUser(@PathVariable Integer userId) {
        return ResponseResult.success(userService.getById(userId));
    }

    @ApiOperation(value = "新增用户", notes = "新增用户")
    @ApiImplicitParam(name = "user", value = "用户信息对象", required = true, dataType = "TUser", paramType = "body")
    @PostMapping
    public ResponseResult<Boolean> save(@RequestBody UserEntity user) {
        return ResponseResult.success(userService.save(user));
    }

    @ApiOperation(value = "删除用户", notes = "根据用户ID删除用户")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "int", paramType = "path")
    @DeleteMapping("/{userId}")
    public ResponseResult<Boolean> delete(@PathVariable Integer userId) {
        return ResponseResult.success(userService.removeById(userId));
    }

    @ApiOperation(value = "更新用户信息", notes = "根据用户ID更新用户信息")
    @ApiImplicitParam(name = "user", value = "用户信息对象", required = true, dataType = "TUser", paramType = "body")
    @PutMapping
    public ResponseResult<Boolean> edit(@RequestBody UserEntity user) {
        Assert.notNull(user.getId());
        return ResponseResult.success(userService.updateById(user));
    }
}
