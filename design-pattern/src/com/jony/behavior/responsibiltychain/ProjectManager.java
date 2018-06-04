/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.behavior.responsibiltychain;

/**
 * @author lichao 2018/6/4 - 上午9:51.
 */
public class ProjectManager extends Handler{

    @Override
    public void handleFeeRequest(String user, double fee) {

        if (fee < 500) {
            System.out.println("项目经理处理了请求");
        } else {
            if (getSuccessor() != null) {
                getSuccessor().handleFeeRequest(user,fee);
            }
        }
    }
}
