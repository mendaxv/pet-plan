package com.pet.system.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zw
 * @date 2024/4/30 14:24
 * @description 账号状态
 */
@Getter
@AllArgsConstructor
public enum UserStatusEnum {

    NORMAL(0, "正常"),
    FROZEN(1, "冻结"),
    ;

    private final Integer code;
    private final String description;
}
