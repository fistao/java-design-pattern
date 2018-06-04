
package com.jony.creational.singleton;

/**
 * @author lichao 2018/6/3 - 下午4:44.
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){};

    private static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
