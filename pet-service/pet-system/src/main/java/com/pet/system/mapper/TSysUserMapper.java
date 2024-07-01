package com.pet.system.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pet.system.model.dto.SysUserDto;
import com.pet.system.model.entity.TSysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pet.system.model.request.UserPageSearchReq;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @description 针对表【t_sys_user(用户表)】的数据库操作Mapper
 * @createDate 2024-06-19 20:20:31
 * @Entity com.pet.system.model.entity.TSysUser
 */
public interface TSysUserMapper extends BaseMapper<TSysUser> {

    /**
     * 分页查询用户列表
     *
     * @param page 分页参数
     * @param req  筛选项
     * @return
     */
    Page<SysUserDto> pageUser(@Param("page") Page<SysUserDto> page,
                              @Param("req") UserPageSearchReq req);
}




