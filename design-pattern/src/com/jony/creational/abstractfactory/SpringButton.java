
package com.jony.creational.abstractfactory;

/**
 * @author lichao 2018/6/4 - 下午3:00.
 */
public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("绿色按钮");
    }
}
