package com.pet.system.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pet.system.mapper.TSysMenuMapper;
import com.pet.system.model.entity.TSysMenu;
import com.pet.system.model.entity.TSysRoleMenu;
import com.pet.system.service.TSysMenuService;
import com.pet.system.service.TSysRoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author Administrator
* @description 针对表【t_sys_menu(权限表)】的数据库操作Service实现
* @createDate 2024-06-19 20:20:31
*/
@Service
public class TSysMenuServiceImpl extends ServiceImpl<TSysMenuMapper, TSysMenu>
    implements TSysMenuService {

    @Resource
    private TSysRoleMenuService sysRoleMenuService;


    @Override
    public List<TSysMenu> listMenu(List<Long> roleIdList) {
        return this.listRoleMenu(roleIdList);
    }

    @Override
    public List<TSysMenu> listMenu(Long roleId) {
        return this.listRoleMenu(ListUtil.of(roleId));
    }

    private List<TSysMenu> listRoleMenu(List<Long> roleIdList) {

        if (CollUtil.isEmpty(roleIdList)) {
            return ListUtil.empty();
        }

        List<Long> menuIdList = sysRoleMenuService.listMenu(roleIdList).stream()
                .map(TSysRoleMenu::getMenuId).collect(Collectors.toList());
        if (CollUtil.isEmpty(menuIdList)) {
            return ListUtil.empty();
        }

        return this.listByIds(menuIdList);
    }
}




