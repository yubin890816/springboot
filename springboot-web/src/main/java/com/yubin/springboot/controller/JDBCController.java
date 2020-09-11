package com.yubin.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * JDBC测试类
 *
 * @author YUBIN
 * @create 2020-09-09
 */
@RestController
public class JDBCController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/empList")
    public List<Map<String, Object>> empList() {
        String sql = "select * from emp";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }
}
