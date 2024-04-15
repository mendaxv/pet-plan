package com.pet.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zw
 * @date 2024/1/23 11:21
 * @description 网关服务
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PetGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetGatewayApplication.class, args);
    }
}
