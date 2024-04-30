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
    LOGIN_FAILURE(10000, "登录失败"),
    LOGIN_SUCCESS(10001, "登录成功"),
    NOT_LOGIN(10002, "未登录"),
    NO_AUTH(10003, "无权限"),
    LOGIN_ACCOUNT_FROZEN(10004, "账号被冻结"),
    LOGIN_ACCOUNT_ABNORMAL(10005, "账号异常"),


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
