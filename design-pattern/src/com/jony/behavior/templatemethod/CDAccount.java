
package com.jony.behavior.templatemethod;

/**
 * @author lichao 2018/6/3 - 下午7:50.
 */
public class CDAccount extends Account{
    @Override
    protected double doCalculateRate() {
        return 0.4;
    }

    @Override
    protected String doGetAccountType() {
        return "C";
    }
}
