/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.creational.builder;

/**
 * @author lichao 2018/6/4 - 下午2:05.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
