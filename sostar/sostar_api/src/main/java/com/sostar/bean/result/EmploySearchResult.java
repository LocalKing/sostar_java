package com.sostar.bean.result;

import com.sostar.bean.EmployInfo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mao_yejun on 2017/1/12.
 */
public class EmploySearchResult implements Serializable {
    private int total;
    private List<EmployInfo> result;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<EmployInfo> getResult() {
        return result;
    }

    public void setResult(List<EmployInfo> result) {
        this.result = result;
    }
}
