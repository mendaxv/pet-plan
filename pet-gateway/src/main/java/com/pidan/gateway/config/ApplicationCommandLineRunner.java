package com.pidan.gateway.config;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import java.net.Inet4Address;

/**
 * @author zw
 * @date 2024/11/26 20:48
 * @description
 */
@Configuration
public class ApplicationCommandLineRunner implements CommandLineRunner {

    @Resource
    private Environment environment;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("====================================");
        System.out.println("服务启动成功：" + environment.getProperty("spring.application.name"));
        System.out.println("环境：" + environment.getProperty("spring.profiles.active"));
        String ip = Inet4Address.getLocalHost().getHostAddress();
        String port = environment.getProperty("server.port");
        String apiDocAddress = StrUtil.format("http://{}:{}/doc.html", ip, port);
        System.out.println("接口在线文档：" + apiDocAddress);
        System.out.println("====================================");
    }
}
