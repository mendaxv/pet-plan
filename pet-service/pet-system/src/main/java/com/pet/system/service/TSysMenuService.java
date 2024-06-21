package com.pet.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pet.system.model.entity.TSysMenu;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_sys_menu(权限表)】的数据库操作Service
* @createDate 2024-06-19 20:20:31
*/
public interface TSysMenuService extends IService<TSysMenu> {

    /**
     * 查询角色关联权限
     *
     * @param roleIdList 角色ID
     * @return
     */
    List<TSysMenu> listMenu(List<Long> roleIdList);

    List<TSysMenu> listMenu(Long roleId);
}
