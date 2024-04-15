package com.pet.system.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zw
 * @date 2024/2/1 9:16
 * @description
 */
@Data
@ApiModel("登录入参")
public class LoginParam {

    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;
}
