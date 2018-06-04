/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.behavior.templatemethod;

/**
 * @author lichao 2018/6/3 - 下午7:42.
 */
public abstract class Account {

    /**
     * 模板方法
     * @return
     */
    public final double calculateInterest(){
        double interestRate = doCalculateRate();
        String accountType = doGetAccountType();
        double amount = calculateAmount(accountType,interestRate);
        return amount;
    }


    protected abstract double doCalculateRate();

    protected abstract String doGetAccountType();

    private double calculateAmount(String accountTyoe, double interestRate) {
        return interestRate * 1000;
    }
}
