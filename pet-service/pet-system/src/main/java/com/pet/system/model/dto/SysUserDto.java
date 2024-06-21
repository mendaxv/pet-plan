package com.pet.system.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zw
 * @date 2024/6/20 19:57
 * @description
 */
@Data
@ApiModel("系统设置-用户实体")
public class SysUserDto {

    @ApiModelProperty("用户id")
    private Long userId;

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

    @ApiModelProperty("角色")
    private List<SysRoleDto> roleList;

    @ApiModelProperty("权限")
    private List<SysMenuDto> menuList;
}
