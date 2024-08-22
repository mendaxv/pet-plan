package com.pidan.system;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zw
 * @date 2024/8/22 9:07
 * @description 单元测试
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PetSystemApplication.class, properties = {"spring.profiles.active=dev"})
public class CommonTest {

    @Test
    public void say()  {
        log.info("hello world");
    }

}
