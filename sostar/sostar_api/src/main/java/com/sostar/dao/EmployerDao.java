package com.sostar.dao;

import com.sostar.bean.param.EmployerAuthParam;
import com.sostar.bean.param.EmployerHomeParam;
import com.sostar.bean.result.EmployerInfoResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * Created by liuyang on 2017/2/16.
 */
@Mapper
public interface EmployerDao {
    ArrayList<EmployerInfoResult> searchEmployer(EmployerHomeParam searchParam);

    ArrayList<EmployerInfoResult> searchStaffOnline(EmployerHomeParam searchParam);

}
