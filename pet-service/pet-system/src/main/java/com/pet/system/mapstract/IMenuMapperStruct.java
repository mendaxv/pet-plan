package com.pet.system.mapstract;

import com.pet.system.model.dto.SysMenuDto;
import com.pet.system.model.entity.TSysMenu;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zw
 * @date 2024/7/1 16:41
 * @description 对象拷贝 TSysMenu <---> SysMenuDto
 */
@Mapper
public interface IMenuMapperStruct {

    IMenuMapperStruct INSTANCT = Mappers.getMapper(IMenuMapperStruct.class);
    TSysMenu dto2entity(SysMenuDto sysMenuDto);
    SysMenuDto entity2Dto(TSysMenu tSysMenu);
    List<SysMenuDto> entity2Dtos(List<TSysMenu> tSysMenuList);
}
