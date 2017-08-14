package com.zf.service;

import com.zf.entity.MyUser;

/**
 * @author zhangf
 * @version V1.0
 * @Description:
 * @date 2017/8/14
 */
public interface MyUserService
{
    MyUser findById(Long id);
    Integer insert(MyUser myUser);
}
