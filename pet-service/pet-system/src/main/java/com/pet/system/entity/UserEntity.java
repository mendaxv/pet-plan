package com.pet.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName t_user
 */
@TableName(value ="t_user")
@Data
public class UserEntity extends BaseEntity {

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 性别（0-未知；1-男；2-女）
     */
    @TableField(value = "sex")
    private Integer sex;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    private String phone;
}