
package com.jony.creational.singleton;

/**
 * @author lichao 2018/6/3 - 下午4:55.
 */
public class LazyInitThreadSafeSingleton {

    private LazyInitThreadSafeSingleton(){};

    private static class SingletonHolder{
        private static LazyInitThreadSafeSingleton instance = new LazyInitThreadSafeSingleton();
    }

    public static LazyInitThreadSafeSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
