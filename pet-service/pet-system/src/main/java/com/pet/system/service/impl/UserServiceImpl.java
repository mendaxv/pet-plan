package com.pet.system.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pet.system.model.UserPageSearchParam;
import com.pet.system.entity.UserEntity;
import com.pet.system.mapper.TUserMapper;
import com.pet.system.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2024-01-24 15:31:27
*/
@Service
public class UserServiceImpl extends ServiceImpl<TUserMapper, UserEntity>
    implements UserService {

    @Override
    public Page<UserEntity> listUser(UserPageSearchParam param) {

        Page<UserEntity> page = new Page<>(param.getPageNo(), param.getPageSize(), true);
        LambdaQueryWrapper<UserEntity> queryWrapper = Wrappers.<UserEntity>lambdaQuery()
                .like(StrUtil.isNotBlank(param.getUsername()), UserEntity::getUsername, param.getUsername())
                .like(StrUtil.isNotBlank(param.getNickname()), UserEntity::getNickname, param.getNickname())
                .like(StrUtil.isNotBlank(param.getPhone()), UserEntity::getPhone, param.getPhone());
        return this.page(page, queryWrapper);
    }
}




