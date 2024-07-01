package com.pet.system.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zw
 * @date 2024/7/1 17:05
 * @description 启用状态
 */
@Getter
@AllArgsConstructor
public enum EnableStatusEnum {

    NORMAL(1, "启用"),
    FORBID(2, "禁用"),
    ;

    private final Integer code;
    private final String desc;
}
