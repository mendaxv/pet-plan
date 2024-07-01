package com.pet.system.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pet.common.exception.BusinessException;
import com.pet.common.response.ResultCode;
import com.pet.system.mapper.TSysRoleMapper;
import com.pet.system.mapstract.IMenuMapperStruct;
import com.pet.system.mapstract.IRoleMapperStruct;
import com.pet.system.model.dto.SysMenuDto;
import com.pet.system.model.dto.SysRoleDto;
import com.pet.system.model.entity.TSysMenu;
import com.pet.system.model.entity.TSysRole;
import com.pet.system.model.entity.TSysRoleMenu;
import com.pet.system.model.request.RolePageSearchReq;
import com.pet.system.service.TSysMenuService;
import com.pet.system.service.TSysRoleMenuService;
import com.pet.system.service.TSysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
* @author Administrator
* @description 针对表【t_sys_role(角色表)】的数据库操作Service实现
* @createDate 2024-06-19 20:20:31
*/
@Service
public class TSysRoleServiceImpl extends ServiceImpl<TSysRoleMapper, TSysRole>
    implements TSysRoleService {

    @Resource
    private TSysMenuService sysMenuService;
    @Resource
    private TSysRoleMenuService sysRoleMenuService;

    @Override
    public SysRoleDto detail(Long id) {
        TSysRole sysRole = Optional.ofNullable(this.getById(id))
                .orElseThrow(() -> new BusinessException(ResultCode.DATA_EMPTY));
        return IRoleMapperStruct.INSTANCT.entity2Dto(sysRole);
    }

    @Override
    public Page<SysRoleDto> pageSearchRole(RolePageSearchReq req) {

        // 分页查询角色
        Page<SysRoleDto> page = new Page<>(req.getPageNo(), req.getPageSize());
        Page<SysRoleDto> sysRoleDtoPage = this.getBaseMapper().pageUser(page, req);

        // 填充角色关联权限
        List<SysRoleDto> sysRoleDtoList = sysRoleDtoPage.getRecords();
        if (CollUtil.isNotEmpty(sysRoleDtoList)) {
            // 全部角色ID
            List<Long> roleIdList = sysRoleDtoList.stream().map(SysRoleDto::getId).collect(Collectors.toList());
            // 全部权限
            Map<Long, TSysMenu> sysMenuMap = sysMenuService.listMenu(roleIdList).stream()
                    .collect(Collectors.toMap(TSysMenu::getId, Function.identity()));
            // 角色权限映射关系
            Map<Long, List<TSysMenu>> sysRolrMenuMap = sysRoleMenuService.listRoleMenu(roleIdList).stream()
                    .collect(Collectors.groupingBy(TSysRoleMenu::getRoleId, Collectors.mapping(e -> sysMenuMap.get(e.getMenuId()), Collectors.toList())));
            // 填充角色关联权限信息
            sysRoleDtoList.forEach(sysRoleDto -> {
                List<TSysMenu> tSysMenuList = sysRolrMenuMap.get(sysRoleDto.getId());
                if (CollUtil.isNotEmpty(tSysMenuList)) {
                    List<SysMenuDto> sysMenuDtos = IMenuMapperStruct.INSTANCT.entity2Dtos(tSysMenuList);
                    sysRoleDto.setMenuDtoList(sysMenuDtos);
                }
            });
        }
        return sysRoleDtoPage;
    }
}




