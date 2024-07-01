package com.pet.system.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zw
 * @date 2024/6/20 19:57
 * @description
 */
@Data
@ApiModel("用户")
public class SysUserDto {

    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("状态（1:正常,2:封禁）")
    private Integer status;
}
