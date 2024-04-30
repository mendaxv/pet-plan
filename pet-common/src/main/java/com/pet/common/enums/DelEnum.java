package com.pet.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zw
 * @date 2024/4/30 13:55
 * @description 逻辑删除
 */
@Getter
@AllArgsConstructor
public enum DelEnum {

    YES(1, "已删除"),
    NO(0, "未删除");

    private final int code;
    private final String description;
}
