package com.pet.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pet.system.model.UserPageSearchParam;
import com.pet.system.entity.UserEntity;

/**
* @author Administrator
* @description 针对表【t_user】的数据库操作Service
* @createDate 2024-01-24 15:31:27
*/
public interface UserService extends IService<UserEntity> {

    /**
     * 分页查询用户列表
     *
     * @param param 分页参数
     * @return
     */
    Page<UserEntity> listUser(UserPageSearchParam param);
}
