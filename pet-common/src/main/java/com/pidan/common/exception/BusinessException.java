package com.pidan.common.exception;

import com.pidan.common.response.HttpStatusEnum;
import lombok.Data;

/**
 * @author zw
 * @date 2024/8/7 10:33
 * @description 业务异常
 */
@Data
public class BusinessException extends RuntimeException {

    private Integer code;

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(HttpStatusEnum httpStatusEnum) {
        super(httpStatusEnum.getMessage());
        this.code = httpStatusEnum.getCode();
    }

    @Override
    public String toString() {
        return "BusinessException{" + "code=" + code + ", message=" + this.getMessage() + '}';
    }
}
