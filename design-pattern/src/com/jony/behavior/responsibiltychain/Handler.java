/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package com.jony.behavior.responsibiltychain;

/**
 * @author lichao 2018/6/4 - 上午9:49.
 */
public abstract class Handler {

    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleFeeRequest(String user, double fee);
}
