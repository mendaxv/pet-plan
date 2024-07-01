package com.pet.system.mapstract;

import com.pet.system.model.dto.SysRoleDto;
import com.pet.system.model.entity.TSysRole;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author zw
 * @date 2024/7/1 16:39
 * @description 对象拷贝 TSysRole <---> SysRoleDto
 */
@Mapper
public interface IRoleMapperStruct {

    IRoleMapperStruct INSTANCT = Mappers.getMapper(IRoleMapperStruct.class);
    TSysRole dto2entity(SysRoleDto sysRoleDto);
    SysRoleDto entity2Dto(TSysRole tSysRole);
}
