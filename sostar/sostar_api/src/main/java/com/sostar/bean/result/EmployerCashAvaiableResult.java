package com.sostar.bean.result;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/3/6.
 */
public class EmployerCashAvaiableResult implements Serializable {
    private Double cashAvaiable;

    public Double getCashAvaiable() {
        return cashAvaiable;
    }

    public void setCashAvaiable(Double cashAvaiable) {
        this.cashAvaiable = cashAvaiable;
    }
}
