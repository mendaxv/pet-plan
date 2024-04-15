package com.pet.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pet.system.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2024-01-24 15:31:27
* @Entity com.pet.system.entity.TUser
*/
@Mapper
public interface TUserMapper extends BaseMapper<UserEntity> {

}




