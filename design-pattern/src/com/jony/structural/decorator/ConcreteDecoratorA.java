/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.structural.decorator;

/**
 * @author lichao 2018/6/4 - 下午1:00.
 */
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("功能二");
    }
}
