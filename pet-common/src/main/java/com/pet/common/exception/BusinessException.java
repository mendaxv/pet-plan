package com.pet.common.exception;

import lombok.Getter;

/**
 * @author zw
 * @date 2024/1/24 16:05
 * @description 自定义业务异常
 */
@Getter
public class BusinessException extends RuntimeException {

    

    /**
     * 异常信息
     */
    private final String errMsg;

    public BusinessException(String errMsg) {
        super(errMsg);
        this.errMsg = errMsg;
    }
}
