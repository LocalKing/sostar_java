package com.sostar.until;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sostar.bean.Pagination;
import com.sostar.bean.PaginationParam;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/1/12.
 */
public class SqlUtils {
    public static <T extends PaginationParam,O extends Serializable> Page<O> getPage(T param){
        Page<O> page;
        if (null ==param || null == param.getPagination()) {
            page = PageHelper.startPage(0, 0, true, false, true);
        } else{
            Pagination pagination =param.getPagination();
            page = PageHelper.startPage(pagination.getStartPos(),pagination.getPageSize());
        }
           return page;
    }
}
