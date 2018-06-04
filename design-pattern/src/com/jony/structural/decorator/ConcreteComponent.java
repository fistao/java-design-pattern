/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.structural.decorator;

/**
 * @author lichao 2018/6/4 - 下午12:57.
 */
public class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("功能一");
    }
}
