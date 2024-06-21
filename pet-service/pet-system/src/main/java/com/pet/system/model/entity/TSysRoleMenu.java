package com.pet.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 角色权限关联表
 * @TableName t_sys_role_menu
 */
@TableName(value ="t_sys_role_menu")
@Data
public class TSysRoleMenu extends BaseEntity {

    /**
     * 角色编号
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 权限编号
     */
    @TableField(value = "menu_id")
    private Long menuId;
}