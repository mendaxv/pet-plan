package com.pet.system.model.request;

import com.pet.common.model.BasePageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zw
 * @date 2024/1/25 10:32
 * @description 用户列表分页查询
 */
@Data
@ApiModel(value = "UserPageSearchReq对象", description = "用户列表查询对象")
public class UserPageSearchReq extends BasePageReq {

    @ApiModelProperty(name = "用户账号")
    private String account;

    @ApiModelProperty(name = "用户昵称")
    private String nickname;

    @ApiModelProperty(name = "用户手机号")
    private String phone;
}
