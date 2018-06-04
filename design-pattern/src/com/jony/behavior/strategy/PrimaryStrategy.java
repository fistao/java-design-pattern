
package com.jony.behavior.strategy;

/**
 * @author lichao 2018/6/4 - 上午11:12.
 */
public class PrimaryStrategy implements DiscountStrategy{

    @Override
    public double calcPrice(double price) {
        return price;
    }
}
