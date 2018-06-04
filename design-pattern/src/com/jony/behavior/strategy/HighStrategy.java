
package com.jony.behavior.strategy;

/**
 * @author lichao 2018/6/4 - 上午11:14.
 */
public class HighStrategy implements DiscountStrategy{
    @Override
    public double calcPrice(double price) {
        return price * 0.6;
    }
}
