package com.zf.thread;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by feng zhang on 2017/5/2.
 * 测试多线程类
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAsyncTaskService {
    @Autowired
    private AsyncTaskService asyncTaskService;

    @Test
    public void testAsyncTask() {
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
    }
}
