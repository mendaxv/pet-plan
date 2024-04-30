package com.pet.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pet.common.enums.GenderEnum;
import lombok.Data;

/**
 * 
 * @TableName t_user
 */
@TableName(value ="t_user")
@Data
public class User extends TableBase {

    /**
     * 用户昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 登录账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 登录密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 性别
     * @see GenderEnum
     */
    @TableField(value = "gender")
    private Integer gender;

    /**
     * 电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 状态
     * @see com.pet.system.model.enums.UserStatusEnum
     */
    @TableField(value = "status")
    private Integer status;

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }
}