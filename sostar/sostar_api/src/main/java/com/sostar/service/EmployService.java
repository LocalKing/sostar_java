package com.sostar.service;

import com.github.pagehelper.Page;
import com.sostar.bean.EmployInfo;
import com.sostar.bean.PaginationResult;
import com.sostar.bean.param.EmploySearchParam;
import com.sostar.dao.EmployDao;
import com.sostar.until.SqlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mao_yejun on 2017/1/12.
 */
@Service
public class EmployService {
    @Autowired
    private EmployDao employDao;

    public PaginationResult<EmployInfo> searchEmploy(EmploySearchParam employSearchParam) {
        Page<EmployInfo> page = SqlUtils.getPage(employSearchParam);
        employDao.searchEmploy(employSearchParam);
        PaginationResult<EmployInfo> paginationResult = new PaginationResult();
        paginationResult.setTotal(page.getTotal());
        paginationResult.setData(page.getResult());
        return paginationResult;
    }
}
