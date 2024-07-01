package com.pet.system.model.request;

import com.pet.common.model.BasePageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zw
 * @date 2024/7/1 16:44
 * @description 角色列表分页查询
 */
@Data
@ApiModel(value = "RolePageSearchReq对象", description = "角色列表分页查询")
public class RolePageSearchReq extends BasePageReq {

    @ApiModelProperty(name = "角色昵称")
    private String nickname;

    @ApiModelProperty(name = "角色标识")
    private String code;
}
