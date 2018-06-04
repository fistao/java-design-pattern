/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.creational.factory;

/**
 * @author lichao 2018/6/4 - 下午2:30.
 */
public class DatabaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("数据库日志系统");
    }
}
