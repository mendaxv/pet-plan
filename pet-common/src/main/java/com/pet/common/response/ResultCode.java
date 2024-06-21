package com.pet.common.response;

import lombok.Getter;

/**
 * @author zw
 * @date 2024/4/30 10:50
 * @description 统一返回错误码
 */
@Getter
public enum ResultCode {

    SUCCESS(0, "请求成功"),
    SYSTEM_ERROR(-1, "系统内部异常"),

    // 登录相关
    LOGIN_ACCOUNT_ERROR(10000, "账号错误"),
    LOGIN_PASSWORD_ERROR(10000, "密码错误"),
    UN_LOGIN_ERROR(10002, "未登录"),
    LOGIN_ACCOUNT_FROZEN(10004, "账号被冻结"),
    LOGIN_ACCOUNT_FORBID(10005, "账号被封禁"),

    PARAMS_ERROR(20000, "参数异常"),
    DATA_EMPTY(20001, "数据为空"),
    FORBIDDEN(50000, "禁止操作"),
    ;

    /**
     * 状态码
     */
    private final int code;

    /**
     * 状态码信息
     */
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
