
package com.jony.structural.decorator;

/**
 * @author lichao 2018/6/4 - 下午12:59.
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
