/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.creational.factory;

/**
 * @author lichao 2018/6/4 - 下午2:31.
 */
public class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
