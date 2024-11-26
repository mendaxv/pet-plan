package com.pidan.system.controller;

import com.pidan.common.exception.BusinessException;
import com.pidan.common.response.HttpStatusEnum;
import com.pidan.common.response.ResponseResult;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zw
 * @date 2024/8/7 11:06
 * @description
 */
@Schema(description = "测试模块")
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/normal")
    @Schema(description = "测试统一结果返回")
    public ResponseResult<String> normal() {
        return ResponseResult.success("test");
    }

    @PostMapping("/exception")
    @Schema(description = "测试统一异常处理")
    public void exception() {
        throw new BusinessException(HttpStatusEnum.ERROR);
    }

}
