package com.pet.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户表
 * @TableName t_sys_user
 */
@TableName(value ="t_sys_user")
@Data
public class TSysUser extends BaseEntity {

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 密码盐
     */
    @TableField(value = "salt")
    private String salt;

    /**
     * 部门ID
     */
    @TableField(value = "dept_id")
    private Long deptId;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 性别（1:男,2:女）
     */
    @TableField(value = "gender")
    private Integer gender;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 电话号码
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 状态（1:正常,2:封禁）
     */
    @TableField(value = "status")
    private Integer status;
}