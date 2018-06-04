/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.behavior.responsibiltychain;

/**
 * @author lichao 2018/6/4 - 上午9:55.
 */
public class DeptManager extends Handler{

    @Override
    public void handleFeeRequest(String user, double fee) {
        if (fee < 1000) {
            System.out.println("部门经理处理了请求");
        } else {
            if (getSuccessor() != null) {
                getSuccessor().handleFeeRequest(user,fee);
            }
        }
    }
}
