package com.pet.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 权限表
 * @TableName t_sys_menu
 */
@TableName(value ="t_sys_menu")
@Data
public class TSysMenu extends BaseEntity {

    /**
     * 菜单名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 父级编号
     */
    @TableField(value = "pid")
    private Long pid;

    /**
     * URL地址
     */
    @TableField(value = "url")
    private String url;

    /**
     * 权限标识
     */
    @TableField(value = "code")
    private String code;

    /**
     * 图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 类型（0:系统 1:目录 2:菜单 3:页签 4:按钮）
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

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