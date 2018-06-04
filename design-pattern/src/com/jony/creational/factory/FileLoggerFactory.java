/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.creational.factory;

/**
 * @author lichao 2018/6/4 - 下午2:32.
 */
public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
