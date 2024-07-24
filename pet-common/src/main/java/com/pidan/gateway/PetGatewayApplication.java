package com.pidan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PetGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetGatewayApplication.class, args);
    }
}