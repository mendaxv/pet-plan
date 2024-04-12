package com.pet.common.response;

import lombok.Getter;

/**
 * @author zw
 * @date 2024/1/24 14:37
 * @description 统一返回结果枚举
 */
@Getter
public enum ResponseResultEnum {

    // 成功
    SUCCESS(0,"操作成功"),
    // 失败
    ERROR(-1,"系统异常"),
    ;

    /**
     * 状态码
     */
    final int code;

    /**
     * 结果信息
     */
    final String msg;

    ResponseResultEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
