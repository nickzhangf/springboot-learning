package com.zf.service.impl;

import com.zf.entity.MyUser;
import com.zf.mapper.MyUserMapper;
import com.zf.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangf
 * @version V1.0
 * @Description:
 * @date 2017/8/14
 */
@Service
public class MyUserServiceImpl implements MyUserService
{
    @Autowired
    private MyUserMapper myUserMapper;

    @Override
    public MyUser findById(Long id)
    {
        return myUserMapper.findById(id);
    }

    @Override
    public Integer insert(MyUser myUser)
    {
        return myUserMapper.insert(myUser);
    }
}
