package com.pet.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pet.system.model.entity.TSysRoleMenu;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_sys_role_menu(角色权限关联表)】的数据库操作Service
* @createDate 2024-06-19 20:20:31
*/
public interface TSysRoleMenuService extends IService<TSysRoleMenu> {

    /**
     * 查询角色关联权限
     *
     * @param roleIdList 角色ID
     * @return
     */
    List<TSysRoleMenu> listMenu(List<Long> roleIdList);

    List<TSysRoleMenu> listMenu(Long roleId);
}
