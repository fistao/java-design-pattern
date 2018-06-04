
package com.jony.creational.abstractfactory;

/**
 * @author lichao 2018/6/4 - 下午3:01.
 */
public class SpringTextField implements TextField{
    @Override
    public void display() {
        System.out.println("绿色文本框");
    }
}
