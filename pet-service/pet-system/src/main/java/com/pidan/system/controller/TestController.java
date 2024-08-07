package com.pidan.system.controller;

import com.pidan.common.exception.BusinessException;
import com.pidan.common.response.HttpStatusEnum;
import com.pidan.common.response.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zw
 * @date 2024/8/7 11:06
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/normal")
    public ResponseResult normal() {
        return ResponseResult.success("test");
    }

    @PostMapping("/exception")
    public ResponseResult exception() {
        throw new BusinessException(HttpStatusEnum.ERROR);
    }

}
