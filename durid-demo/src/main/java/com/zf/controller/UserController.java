package com.zf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangf
 * @version V1.0
 * @Description:
 * @date 2017/8/10
 */
@RestController
public class UserController
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/getUsername")
    public String getUsername(Long id)
    {
        return getUsernameById(id);
    }

    private String getUsernameById(Long id)
    {
        String sql = "select username from my_user where id = ?";
        String username = jdbcTemplate.queryForObject(sql, new Object[] {id}, String.class);
        return username;
    }
}
