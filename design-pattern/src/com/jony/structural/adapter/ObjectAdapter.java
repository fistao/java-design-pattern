
package com.jony.structural.adapter;

/**
 * @author lichao 2018/6/4 - 上午11:45.
 */
public class ObjectAdapter{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void operation1(){
        this.adaptee.operation1();
    }

    public void operation2(){
        System.out.println("operation2");
    }
}
