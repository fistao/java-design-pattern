
package com.jony.behavior.strategy;

/**
 * @author lichao 2018/6/4 - 上午11:15.
 */
public class Price {
    private DiscountStrategy discountStrategy;

    public Price(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double quote(double price) {
        return this.discountStrategy.calcPrice(price);
    }
}
