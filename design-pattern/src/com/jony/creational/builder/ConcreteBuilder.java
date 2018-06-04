/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.creational.builder;

/**
 * @author lichao 2018/6/4 - 下午2:03.
 */
public class ConcreteBuilder implements Builder{

    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("part1 is set");
    }

    @Override
    public void buildPart2() {
        product.setPart2("part2 is set");
    }

    @Override
    public Product retriveProduct() {
        return product;
    }
}
