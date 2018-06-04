
package com.jony.structural.proxy;

/**
 * @author lichao 2018/6/3 - 下午7:18.
 */
public class ProxyObject extends AbstractObjeact{

    RealObject realObject = new RealObject();

    @Override
    public void operation() {
        System.out.println("before");
        realObject.operation();
        System.out.println("after");
    }
}
