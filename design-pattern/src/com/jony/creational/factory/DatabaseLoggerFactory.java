
package com.jony.creational.factory;

/**
 * @author lichao 2018/6/4 - 下午2:32.
 */
public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
