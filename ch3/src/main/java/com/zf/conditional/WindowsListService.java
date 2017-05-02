package com.zf.conditional;

/**
 * Created by feng zhang on 2017/5/2.
 */
public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
