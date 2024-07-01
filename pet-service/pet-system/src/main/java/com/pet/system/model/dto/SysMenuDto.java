package com.pet.system.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zw
 * @date 2024/6/20 20:04
 * @description
 */
@Data
@ApiModel("菜单")
public class SysMenuDto {

    @ApiModelProperty(name = "权限id")
    private Long id;

    @ApiModelProperty(name = "父权限id")
    private Long pid;

    @ApiModelProperty(name = "权限名称")
    private String name;

    @ApiModelProperty(name = "权限标识")
    private String code;

    @ApiModelProperty(name = "权限类型")
    private Integer type;

    /**
     * @see com.pet.system.model.enums.EnableStatusEnum
     */
    @ApiModelProperty(name = "状态")
    private Integer status;
}
