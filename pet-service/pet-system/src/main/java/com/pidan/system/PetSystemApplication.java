package com.pidan.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.pidan"})
public class PetSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetSystemApplication.class, args);
    }
}