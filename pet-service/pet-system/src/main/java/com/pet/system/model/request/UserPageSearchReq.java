package com.pet.system.model.request;

import com.pet.common.model.BasePageRequest;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author zw
 * @date 2024/1/25 10:32
 * @description 用户列表分页查询
 */
@Data
@ApiModel(value = "UserPageSearchParam对象", description = "用户列表查询对象")
public class UserPageSearchReq extends BasePageRequest {

    /**
     * 账号
     */
    private String account;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号
     */
    private String phone;
}
