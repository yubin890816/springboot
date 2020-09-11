package com.yubin.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot Web项目开发示例
 *
 * @author YUBIN
 * @create 2020-09-08
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello Spring Boot!";
    }
}
