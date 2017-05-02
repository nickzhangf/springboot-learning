package com.zf.conditional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by feng zhang on 2017/5/2.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestConditional {
    @Autowired
    private ListService listService;

    @Test
    public void testConditional() {
        System.out.println("本系统下列表命令为：" + listService.showListCmd());
    }
}
