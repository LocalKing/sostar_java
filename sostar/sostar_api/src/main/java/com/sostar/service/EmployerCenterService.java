package com.sostar.service;

import com.sostar.bean.param.EmployerAuthParam;
import com.sostar.bean.param.EmployerCenterParam;
import com.sostar.bean.param.EmployerInfoParam;
import com.sostar.bean.result.EmployerCenterResult;
import com.sostar.dao.EmployerCenterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mao_yejun，liuyang on 2017/2/16.
 */
@Service
public class EmployerCenterService {
    @Autowired
    private EmployerCenterDao employerCenterDao;

    public EmployerCenterResult getEmployerCenter(EmployerCenterParam param) {
        EmployerCenterResult employerCenterResult = employerCenterDao.getEmployerCenter(param);
        if (employerCenterResult == null) {
            return new EmployerCenterResult();
        }
        return employerCenterResult;
    }

    public boolean setEmployerAuthentica(EmployerAuthParam employerAuthParam) {
        return employerCenterDao.setEmployerAuthentica(employerAuthParam) != 0;
    }
    public boolean setEmployerInfo(EmployerInfoParam employerInfoParam) {
        return employerCenterDao.setEmployerInfo(employerInfoParam) != 0;
    }

}
