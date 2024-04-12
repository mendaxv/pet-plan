package com.pet.common.response;

/**
 * @author zw
 * @date 2024/4/12 17:37
 * @description
 */
public class BaseResponse {

    public static <T> ResponseResult<T> success(T data) {
        return success(ResponseResultEnum.SUCCESS.getCode(), ResponseResultEnum.SUCCESS.getMsg(), data);
    }

    public static <T> ResponseResult<T> success() {
        return success(ResponseResultEnum.SUCCESS.getCode(), ResponseResultEnum.SUCCESS.getMsg(), null);
    }

    public static <T> ResponseResult<T> error(ResponseResultEnum responseResultEnum) {
        return error(responseResultEnum.getCode(), responseResultEnum.getMsg());
    }

    public static <T> ResponseResult<T> error() {
        return error(ResponseResultEnum.ERROR.getCode(), ResponseResultEnum.ERROR.getMsg());
    }

    /**
     * 响应成功
     *
     * @param code 状态码
     * @param message 描述
     * @param data 数据
     * @return ResponseResult
     */
    private static <T> ResponseResult<T> success(Integer code, String message, T data) {
        ResponseResult<T> response = new ResponseResult<>();
        response.setCode(code);
        response.setMsg(message);
        response.setData(data);
        return response;
    }

    /**
     * 响应失败
     *
     * @param code 状态码
     * @param message 描述
     * @return ResponseResult
     */
    private static <T> ResponseResult<T> error(Integer code, String message) {
        ResponseResult<T> response = new ResponseResult<>();
        response.setCode(code);
        response.setMsg(message);
        return response;
    }
}
