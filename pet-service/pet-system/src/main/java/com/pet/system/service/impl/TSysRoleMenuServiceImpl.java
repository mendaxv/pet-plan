package com.pet.system.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pet.system.mapper.TSysRoleMenuMapper;
import com.pet.system.model.entity.TSysRoleMenu;
import com.pet.system.service.TSysRoleMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_sys_role_menu(角色权限关联表)】的数据库操作Service实现
* @createDate 2024-06-19 20:20:31
*/
@Service
public class TSysRoleMenuServiceImpl extends ServiceImpl<TSysRoleMenuMapper, TSysRoleMenu>
    implements TSysRoleMenuService {

    @Override
    public List<TSysRoleMenu> listRoleMenu(List<Long> roleIdList) {
        return this.listMenu(roleIdList);
    }

    @Override
    public List<TSysRoleMenu> listRoleMenu(Long roleId) {
        return this.listMenu(ListUtil.of(roleId));
    }

    private List<TSysRoleMenu> listMenu(List<Long> roleIdList) {

        if (CollUtil.isEmpty(roleIdList)) {
            return ListUtil.empty();
        }

        LambdaQueryWrapper<TSysRoleMenu> queryWrapper = Wrappers.<TSysRoleMenu>lambdaQuery()
                .in(TSysRoleMenu::getRoleId, roleIdList);
        return this.list(queryWrapper);
    }


}




