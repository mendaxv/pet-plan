package com.pet.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pet.system.model.dto.SysRoleDto;
import com.pet.system.model.entity.TSysRole;
import com.pet.system.model.request.RolePageSearchReq;

/**
 * @author Administrator
 * @description 针对表【t_sys_role(角色表)】的数据库操作Service
 * @createDate 2024-06-19 20:20:31
 */
public interface TSysRoleService extends IService<TSysRole> {

    /**
     * 角色详情
     *
     * @param id 角色id
     * @return
     */
    SysRoleDto detail(Long id);

    /**
     * 角色列表分页查询
     *
     * @param req 请求入参
     * @return
     */
    Page<SysRoleDto> pageSearchRole(RolePageSearchReq req);


}
