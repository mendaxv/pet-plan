package com.pet.service.system.controller;

import com.pet.common.response.BaseResponse;
import com.pet.common.response.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zw
 * @date 2024/4/12 17:42
 * @description
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseResponse {

    @GetMapping("/hello")
    public ResponseResult hello() {
        return success();
    }

}
