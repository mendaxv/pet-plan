package com.pet.system.controller;

import com.pet.system.service.TSysMenuService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zw
 * @date 2024/7/1 10:00
 * @description 系统设置-菜单管理
 */
@RestController
@RequestMapping("/system/menu")
@Api(value = "系统设置-菜单管理")
public class SysMenuController {

    @Resource
    private TSysMenuService sysMenuService;


}
