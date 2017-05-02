package com.zf.conditional;

/**
 * Created by feng zhang on 2017/5/2.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
