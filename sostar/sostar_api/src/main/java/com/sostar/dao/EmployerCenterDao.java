package com.sostar.dao;

import com.sostar.bean.param.EmployerAuthParam;
import com.sostar.bean.param.EmployerCenterParam;
import com.sostar.bean.param.EmployerInfoParam;
import com.sostar.bean.result.EmployerCenterResult;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by mao_yejun on 2017/2/16.
 */
@Mapper
public interface EmployerCenterDao {
    EmployerCenterResult getEmployerCenter(EmployerCenterParam param);
    int setEmployerAuthentica(EmployerAuthParam employerAuthParam);
    int setEmployerInfo(EmployerInfoParam employerInfoParam);
}
