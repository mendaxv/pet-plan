package com.pet.system.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pet.system.mapper.TSysRoleMapper;
import com.pet.system.model.entity.TSysRole;
import com.pet.system.model.entity.TSysUserRole;
import com.pet.system.service.TSysRoleService;
import com.pet.system.service.TSysUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
* @author Administrator
* @description 针对表【t_sys_role(角色表)】的数据库操作Service实现
* @createDate 2024-06-19 20:20:31
*/
@Service
public class TSysRoleServiceImpl extends ServiceImpl<TSysRoleMapper, TSysRole>
    implements TSysRoleService{

    @Resource
    private TSysUserRoleService sysUserRoleService;

    @Override
    public List<TSysRole> listRole(Long userId) {

        if (Objects.isNull(userId)) {
            return ListUtil.empty();
        }

        List<Long> roleIdList = sysUserRoleService.listRole(userId).stream()
                .map(TSysUserRole::getRoleId).collect(Collectors.toList());
        if (CollUtil.isEmpty(roleIdList)) {
            return ListUtil.empty();
        }

        return this.listByIds(roleIdList);
    }
}




