/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.structural.decorator;

/**
 * @author lichao 2018/6/4 - 下午1:02.
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("功能三");
    }
}
