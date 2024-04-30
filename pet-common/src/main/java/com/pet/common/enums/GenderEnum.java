package com.pet.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zw
 * @date 2024/4/30 13:49
 * @description 性别
 */
@Getter
@AllArgsConstructor
public enum GenderEnum {

    MALE(1, "男性"),
    FEMALE(2, "女性");

    private final int code;
    private final String description;
}
