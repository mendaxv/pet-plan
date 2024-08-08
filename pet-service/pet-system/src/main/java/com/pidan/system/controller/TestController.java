package com.pidan.system.controller;

import com.pidan.common.exception.BusinessException;
import com.pidan.common.response.HttpStatusEnum;
import com.pidan.common.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zw
 * @date 2024/8/7 11:06
 * @description
 */
@Api(tags = "测试模块")
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/normal")
    @ApiOperation(value = "测试统一结果返回")
    public ResponseResult normal() {
        return ResponseResult.success("test");
    }

    @PostMapping("/exception")
    @ApiOperation(value = "测试统一异常处理")
    public ResponseResult exception() {
        throw new BusinessException(HttpStatusEnum.ERROR);
    }

}
