/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.structural.adapter;

/**
 * @author lichao 2018/6/4 - 上午11:44.
 */
public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void operation2() {
        System.out.println("operation2");
    }
}
