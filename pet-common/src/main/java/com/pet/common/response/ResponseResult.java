package com.pet.common.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zw
 * @date 2024/1/24 14:34
 * @description 统一返回结果
 */
@Data
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 描述
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    /**
     * 封装成功响应的方法
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

    public static <T> ResponseResult<T> success(T data) {
        return success(ResponseResultEnum.SUCCESS.getCode(), ResponseResultEnum.SUCCESS.getMsg(), data);
    }

    public static <T> ResponseResult<T> success() {
        return success(ResponseResultEnum.SUCCESS.getCode(), ResponseResultEnum.SUCCESS.getMsg(), null);
    }

    /**
     * 封装失败的响应
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

    public static <T> ResponseResult<T> error(ResponseResultEnum responseResultEnum) {
        return error(responseResultEnum.getCode(), responseResultEnum.getMsg());
    }

    public static <T> ResponseResult<T> error() {
        return error(ResponseResultEnum.ERROR.getCode(), ResponseResultEnum.ERROR.getMsg());
    }

    public static <T> ResponseResult<T> error(String message) {
        return error(ResponseResultEnum.ERROR.getCode(), message);
    }
}
