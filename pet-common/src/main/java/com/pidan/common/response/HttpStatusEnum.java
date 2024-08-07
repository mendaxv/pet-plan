package com.pidan.common.response;

import lombok.Getter;

/**
 * @author zw
 * @date 2024/8/7 10:16
 * @description Http状态返回枚举
 */
@Getter
public enum HttpStatusEnum {

    SUCCESS(200, "操作成功"),
    ERROR(500, "系统内部错误"),
    ;

    private final Integer code;
    private final String message;

    HttpStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
