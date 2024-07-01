package com.pet.system.mapstract;

import com.pet.system.model.dto.SysUserDto;
import com.pet.system.model.entity.TSysUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zw
 * @date 2024/6/26 14:36
 * @description 对象拷贝 TSysUser <---> SysUserDto
 */
@Mapper
public interface IUserMapperStruct {
    IUserMapperStruct INSTANCT = Mappers.getMapper(IUserMapperStruct.class);
    TSysUser dto2entity(SysUserDto sysUserDto);
    SysUserDto entity2Dto(TSysUser tSysUser);
    List<SysUserDto> entity2Dtos(List<TSysUser> tSysUserList);
}
