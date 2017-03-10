package com.sostar.service;

import com.github.pagehelper.Page;
import com.sostar.bean.PaginationResult;
import com.sostar.bean.param.EmployerAuthParam;
import com.sostar.bean.param.EmployerHomeParam;
import com.sostar.bean.result.EmployerInfoResult;
import com.sostar.bean.result.StaffInfoResult;
import com.sostar.dao.EmployerDao;
import com.sostar.until.SqlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuyang on 2017/2/16.
 */
@Service
public class EmployerService {
    @Autowired
    private EmployerDao employerDao;

    /**
     * 根据companyId搜索已发单企业
     * * @param employerHomeParam
     *
     * @return
     */

    public PaginationResult<EmployerInfoResult> searchEmployer(EmployerHomeParam employerHomeParam) {
        Page<EmployerInfoResult> page = SqlUtils.getPage(employerHomeParam);
        employerDao.searchEmployer(employerHomeParam);
        PaginationResult<EmployerInfoResult> paginationResult = new PaginationResult();
        paginationResult.setTotal(page.getTotal());
        paginationResult.setData(page.getResult());
        return paginationResult;
    }

    /**
     * 根据companyId搜索已在线员工
     *
     * @param employerHomeParam
     * @return
     */
    public PaginationResult<StaffInfoResult> searchStaffOnline(EmployerHomeParam employerHomeParam) {
        Page<StaffInfoResult> page = SqlUtils.getPage(employerHomeParam);
        employerDao.searchStaffOnline(employerHomeParam);
        PaginationResult<StaffInfoResult> paginationResult = new PaginationResult();
        paginationResult.setTotal(page.getTotal());
        paginationResult.setData(page.getResult());
        return paginationResult;
    }

}
