package com.pet.system.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pet.system.mapper.TSysUserRoleMapper;
import com.pet.system.model.entity.TSysUserRole;
import com.pet.system.service.TSysUserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【t_sys_user_role(用户角色关联表)】的数据库操作Service实现
* @createDate 2024-06-19 20:20:31
*/
@Service
public class TSysUserRoleServiceImpl extends ServiceImpl<TSysUserRoleMapper, TSysUserRole>
    implements TSysUserRoleService{

    @Override
    public List<TSysUserRole> listRole(List<Long> userIdList) {
        return this.listUserRole(userIdList);
    }

    @Override
    public List<TSysUserRole> listRole(Long userId) {
        return this.listUserRole(ListUtil.of(userId));
    }

    private List<TSysUserRole> listUserRole(List<Long> userIdList) {

        if (CollUtil.isEmpty(userIdList)) {
            return ListUtil.empty();
        }

        LambdaQueryWrapper<TSysUserRole> queryWrapper = Wrappers.<TSysUserRole>lambdaQuery()
                .in(TSysUserRole::getUserId, userIdList);
        return this.list(queryWrapper);
    }
}




