package com.pet.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pet.system.model.entity.TSysUserRole;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_sys_user_role(用户角色关联表)】的数据库操作Service
* @createDate 2024-06-19 20:20:31
*/
public interface TSysUserRoleService extends IService<TSysUserRole> {

    /**
     * 查询用户关联角色
     *
     * @param userIdList 用户ID
     * @return
     */
    List<TSysUserRole> listRole(List<Long> userIdList);

    List<TSysUserRole> listRole(Long userId);
}
