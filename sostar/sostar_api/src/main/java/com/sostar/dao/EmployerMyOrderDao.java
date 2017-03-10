package com.sostar.dao;

import com.sostar.bean.entity.EmployerOrderEntity;
import com.sostar.bean.entity.SetEmployerOrderEntity;
import com.sostar.bean.param.EmployerCashAvaiableParam;
import com.sostar.bean.param.EmployerMyOrderParam;
import com.sostar.bean.param.SetDraftToOrderParam;
import com.sostar.bean.param.SetEmployerOrderParam;
import com.sostar.bean.result.EmployerCashAvaiableResult;
import com.sostar.bean.result.EmployerMyOrderResult;
import com.sostar.bean.result.SetEmployerOrderResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by liuyang on 2017/2/16.
 */
@Mapper
public interface EmployerMyOrderDao {
    List<EmployerMyOrderResult> getEmployerMyOrderList(EmployerOrderEntity employerOrderEntity);
    int setEmployerOrder(SetEmployerOrderEntity param);
    EmployerCashAvaiableResult getEmployerCashAvaiable(EmployerCashAvaiableParam param);
    int setDraftToOrder(SetDraftToOrderParam param);
}
