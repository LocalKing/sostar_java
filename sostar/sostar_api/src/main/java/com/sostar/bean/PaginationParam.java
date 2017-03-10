package com.sostar.bean;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/1/12.
 */
public class PaginationParam implements Serializable {
    private Pagination pagination;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
