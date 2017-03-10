package com.sostar.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mao_yejun on 2017/1/12.
 */
public class PaginationResult<T extends Serializable> implements Serializable {
    private long total;
    private List<T> data;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
