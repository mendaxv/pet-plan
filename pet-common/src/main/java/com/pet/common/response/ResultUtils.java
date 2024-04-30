package com.pet.common.response;

/**
 * @author zw
 * @date 2024/4/30 11:17
 * @description 统一返回工具类
 */
public class ResultUtils {

    /**
     * 操作成功
     *
     * @param code 状态码
     * @param data 数据
     * @param message 描述
     * @return
     */
    private static <T> BaseResponse<T> success(int code, T data, String message) {
        return new BaseResponse<>(code, data, message);
    }

    public static <T> BaseResponse<T> success() {
        return success(ResultCode.SUCCESS.getCode(), null, ResultCode.SUCCESS.getMessage());
    }

    public static <T> BaseResponse<T> success(T data) {
        return success(ResultCode.SUCCESS.getCode(), data, ResultCode.SUCCESS.getMessage());
    }

    private static <T> BaseResponse<T> success(ResultCode resultCode) {
        return new BaseResponse<>(resultCode.getCode(), null, resultCode.getMessage());
    }

    /**
     * 操作失败
     *
     * @param code 状态码
     * @param data 数据
     * @param message 描述
     * @return
     */
    private static <T> BaseResponse<T> error(int code, T data, String message) {
        return new BaseResponse<>(code, data, message);
    }

    public static BaseResponse<Void> error(ResultCode resultCode) {
        return error(resultCode.getCode(), null, resultCode.getMessage());
    }

    public static BaseResponse<Void> error(String message) {
        return error(ResultCode.SYSTEM_ERROR.getCode(), null, message);
    }

    public static BaseResponse<Void> error(int code, String message) {
        return error(code, null, message);
    }
}
