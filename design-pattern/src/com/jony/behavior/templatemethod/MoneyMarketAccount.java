/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.behavior.templatemethod;

/**
 * @author lichao 2018/6/3 - 下午7:49.
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected double doCalculateRate() {
        return 0.045;
    }

    @Override
    protected String doGetAccountType() {
        return "M";
    }
}
