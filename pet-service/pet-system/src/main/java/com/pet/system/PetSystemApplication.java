package com.pet.system;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.pet.system.mapper")
public class PetSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetSystemApplication.class, args);
    }
}