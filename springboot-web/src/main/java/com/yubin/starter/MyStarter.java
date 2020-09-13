package com.yubin.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义Starter
 *
 * @author YUBIN
 * @create 2020-09-13
 */
@Configuration
@ConditionalOnProperty(name = "enable.autoConfiguation")
public class MyStarter {

    public MyStarter() {
        System.out.println("MyStarter init......");
    }

    @Bean
    public Person person() {
        return new Person();
    }
}
