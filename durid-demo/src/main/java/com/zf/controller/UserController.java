package com.zf.controller;

import com.zf.entity.MyUser;
import com.zf.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    @Autowired
    private MyUserService myUserService;

    @GetMapping("/getUsername")
    public String getUsername(Long id)
    {
        return getUsernameById(id);
    }

    @PostMapping("/getUser")
    public MyUser getUserById(Long id)
    {
        return myUserService.findById(id);
    }

    @PostMapping("/insert")
    public Integer insert(MyUser myUser)
    {
        return myUserService.insert(myUser);
    }

    private String getUsernameById(Long id)
    {
        String sql = "select username from my_user where id = ?";
        String username = jdbcTemplate.queryForObject(sql, new Object[] {id}, String.class);
        return username;
    }

}
