package com.pet.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户角色关联表
 * @TableName t_sys_user_role
 */
@TableName(value ="t_sys_user_role")
@Data
public class TSysUserRole extends BaseEntity {

    /**
     * 用户编号
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 角色编号
     */
    @TableField(value = "role_id")
    private Long roleId;
}