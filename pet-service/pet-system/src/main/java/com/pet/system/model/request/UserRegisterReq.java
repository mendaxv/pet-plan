package com.pet.system.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zw
 * @date 2024/4/30 13:30
 * @description 用户注册请求入参
 */
@Data
@ApiModel("用户注册请求入参")
public class UserRegisterReq implements Serializable {

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("账号")
    @NotBlank(message = "账号为空")
    private String account;

    @ApiModelProperty("密码")
    @NotBlank(message = "密码为空")
    private String password;
}
