/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.creational.singleton;

/**
 * @author lichao 2018/6/3 - 下午4:41.
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){};

    public static EagerSingleton getInstance() {
        return instance;
    }
}
