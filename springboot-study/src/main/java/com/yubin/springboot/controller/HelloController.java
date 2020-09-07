package com.yubin.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot项目测试
 *
 * @author YUBIN
 * @create 2020-09-07
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {

        return "hello Spring Boot";
    }
}
