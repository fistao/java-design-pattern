/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.structural.proxy;

/**
 * @author lichao 2018/6/3 - 下午7:18.
 */
public class RealObject extends AbstractObjeact{
    @Override
    public void operation() {
        System.out.println("hello, proxy pattern!");
    }
}
