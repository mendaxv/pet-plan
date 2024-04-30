package com.pet.system.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zw
 * @date 2024/4/25 14:47
 * @description 登录方式
 */
@Getter
@AllArgsConstructor
public enum LoginTypeEnum {

    NORMAL(1, "账号密码"),
    phone(2, "短信验证码"),
    WECHAT(3, "微信登录"),
    ;

    private final Integer code;
    private final String description;
}
