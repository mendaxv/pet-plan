package com.pet.system.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zw
 * @date 2024/4/25 14:30
 * @description 当前登录用户信息
 */
@Data
@ApiModel("当前登录用户信息")
public class LoginUserInfo {

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("账号")
    private String account;
}
