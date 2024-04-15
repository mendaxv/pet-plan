package com.pet.system.config;

import cn.dev33.satoken.SaManager;
import cn.hutool.core.util.StrUtil;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zw
 * @date 2024/1/30 10:19
 * @description 应用启动必要日志
 */
@Component
public class ApplicationStartupInfo implements ApplicationRunner {

    @Resource
    private Environment environment;

    @Override
    public void run(ApplicationArguments args) throws UnknownHostException {

        // Sa-Token 配置
        System.out.println("启动成功，Sa-Token 配置如下：" + SaManager.getConfig());

        // 【knife4j】在线API文档
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = environment.getProperty("server.port");
        String apiDocUrl = StrUtil.format("在线API文档：http://{}:{}/doc.html", ip, port);
        System.out.println(apiDocUrl);

    }
}
