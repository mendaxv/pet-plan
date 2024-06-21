package com.pet.system.config.saToken;

import cn.dev33.satoken.stp.StpInterface;
import com.pet.system.service.TSysMenuService;
import com.pet.system.service.TSysRoleService;
import com.pet.system.service.TSysUserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zw
 * @date 2024/6/20 16:57
 * @description 自定义权限加载接口实现类
 */
@Component
public class StpInterfaceImpl implements StpInterface {

    @Resource
    private TSysUserService sysUserService;
    @Resource
    private TSysRoleService sysRoleService;
    @Resource
    private TSysMenuService sysMenuService;

    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        return null;
    }

    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        return null;
    }
}
