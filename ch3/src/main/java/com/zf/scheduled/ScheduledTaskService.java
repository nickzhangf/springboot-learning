package com.zf.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by feng zhang on 2017/5/2.
 * 计划任务执行类
 */
@Service
public class ScheduledTaskService {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次：" + dateFormat.format(new Date()));
    }
}
