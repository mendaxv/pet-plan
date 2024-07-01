package com.pet.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pet.system.model.dto.SysRoleDto;
import com.pet.system.model.entity.TSysRole;
import com.pet.system.model.request.RolePageSearchReq;
import org.apache.ibatis.annotations.Param;

/**
* @author Administrator
* @description 针对表【t_sys_role(角色表)】的数据库操作Mapper
* @createDate 2024-06-19 20:20:31
* @Entity com.pet.system.model.entity.TSysRole
*/
public interface TSysRoleMapper extends BaseMapper<TSysRole> {

    /**
     * 分页查询角色列表
     *
     * @param page 分页参数
     * @param req  筛选项
     * @return
     */
    Page<SysRoleDto> pageUser(@Param("page") Page<SysRoleDto> page,
                              @Param("req") RolePageSearchReq req);
}




