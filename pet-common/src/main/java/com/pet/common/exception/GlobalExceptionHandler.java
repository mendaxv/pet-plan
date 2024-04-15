package com.pet.common.exception;

import cn.hutool.core.exceptions.ExceptionUtil;
import com.pet.common.response.ResponseResult;
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

    /**
     * 全局异常
     *
     * @param e 异常
     * @return ResponseResult
     */
    @ExceptionHandler(Exception.class)
    public ResponseResult exceptionHandler(Exception e) {
        log.error("系统异常：{}", ExceptionUtil.getMessage(e));
        return ResponseResult.error();
    }
}
