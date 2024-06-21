package com.pet.system.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zw
 * @date 2024/2/1 9:16
 * @description 登录入参
 */
@Data
@ApiModel("登录入参")
public class UserLoginReq {

    @ApiModelProperty("登录账号")
    private String account;

    @ApiModelProperty("登录密码")
    private String password;
}
