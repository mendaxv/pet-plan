package com.pet.system.model;

import com.pet.common.model.BasePageParam;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author zw
 * @date 2024/1/25 10:32
 * @description 用户列表分页查询
 */
@Data
@ApiModel(value = "UserPageSearchParam对象", description = "用户列表查询对象")
public class UserPageSearchParam extends BasePageParam {

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号
     */
    private String phone;
}
