package com.pet.system.model.request;

import com.pet.system.model.enums.LoginTypeEnum;
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
public class UserLoginRequest {

    @ApiModelProperty("登录方式")
    private LoginTypeEnum loginType;

    @ApiModelProperty("登录账号")
    private String account;

    @ApiModelProperty("登录")
    private String password;

    @ApiModelProperty("手机号码")
    private String phone;

    @ApiModelProperty("短信验证码")
    private String smsCode;
}
