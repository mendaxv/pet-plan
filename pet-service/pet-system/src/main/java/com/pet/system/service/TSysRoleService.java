package com.pet.system.service;

import com.pet.system.model.entity.TSysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_sys_role(角色表)】的数据库操作Service
* @createDate 2024-06-19 20:20:31
*/
public interface TSysRoleService extends IService<TSysRole> {

    /**
     * 根据用户id查询角色
     *
     * @param userId 用户ID
     * @return
     */
    List<TSysRole> listRole(Long userId);
}
