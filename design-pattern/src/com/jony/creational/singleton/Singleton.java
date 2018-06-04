/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.creational.singleton;

/**
 * @author lichao 2018/6/3 - 下午4:50.
 */
public class Singleton {
    private volatile static Singleton instance = null;

    private Singleton(){};

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
