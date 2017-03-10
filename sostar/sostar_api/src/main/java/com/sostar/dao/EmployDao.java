package com.sostar.dao;

import com.sostar.bean.EmployInfo;
import com.sostar.bean.param.EmploySearchParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * Created by mao_yejun on 2017/1/12.
 */
@Mapper
public interface EmployDao {
    ArrayList<EmployInfo> searchEmploy(EmploySearchParam searchParam);
}
