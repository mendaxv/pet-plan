package com.pet.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 角色表
 * @TableName t_sys_role
 */
@Data
@TableName(value ="t_sys_role")
public class TSysRole extends BaseEntity {

    /**
     * 角色名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 角色标识
     */
    @TableField(value = "code")
    private String code;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 状态（1:启用,2:禁用）
     */
    @TableField(value = "status")
    private Integer status;
}