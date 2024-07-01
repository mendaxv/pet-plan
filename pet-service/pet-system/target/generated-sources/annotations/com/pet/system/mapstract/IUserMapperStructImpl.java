package com.pet.system.mapstract;

import com.pet.system.model.dto.SysUserDto;
import com.pet.system.model.entity.TSysUser;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-01T09:58:40+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
public class IUserMapperStructImpl implements IUserMapperStruct {

    @Override
    public TSysUser dto2entity(SysUserDto sysUserDto) {
        if ( sysUserDto == null ) {
            return null;
        }

        TSysUser tSysUser = new TSysUser();

        return tSysUser;
    }

    @Override
    public SysUserDto entity2Dto(TSysUser tSysUser) {
        if ( tSysUser == null ) {
            return null;
        }

        SysUserDto sysUserDto = new SysUserDto();

        return sysUserDto;
    }

    @Override
    public List<SysUserDto> entity2Dtos(List<TSysUser> tSysUserList) {
        if ( tSysUserList == null ) {
            return null;
        }

        List<SysUserDto> list = new ArrayList<SysUserDto>( tSysUserList.size() );
        for ( TSysUser tSysUser : tSysUserList ) {
            list.add( entity2Dto( tSysUser ) );
        }

        return list;
    }
}
