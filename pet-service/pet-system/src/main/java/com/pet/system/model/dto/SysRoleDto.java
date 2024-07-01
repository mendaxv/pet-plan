package com.pet.system.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zw
 * @date 2024/6/20 20:03
 * @description
 */
@Data
@ApiModel("角色")
public class SysRoleDto {

    @ApiModelProperty(name = "角色id")
    private Long id;

    @ApiModelProperty(name = "角色名称")
    private String name;

    @ApiModelProperty(name = "角色标识")
    private String code;

    /**
     * @see com.pet.system.model.enums.EnableStatusEnum
     */
    @ApiModelProperty(name = "状态")
    private Integer status;

    @ApiModelProperty(name = "角色权限")
    private List<SysMenuDto> menuDtoList;
}
