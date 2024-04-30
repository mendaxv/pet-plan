package com.pet.common.exception;

import cn.hutool.core.exceptions.ExceptionUtil;
import com.pet.common.response.BaseResponse;
import com.pet.common.response.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zw
 * @date 2024/1/24 16:07
 * @description 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<Void> businessExceptionHandler(BusinessException e) {
        log.error("businessException: " + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse<Void> exceptionHandler(Exception e) {
        log.error("系统异常：{}", ExceptionUtil.getMessage(e));
        return ResultUtils.error(e.getMessage());
    }
}
