package com.sostar.service;

import com.github.pagehelper.Page;
import com.sostar.bean.PaginationResult;
import com.sostar.bean.entity.EmployerOrderEntity;
import com.sostar.bean.entity.SetEmployerOrderEntity;
import com.sostar.bean.param.*;
import com.sostar.bean.result.EmployerCashAvaiableResult;
import com.sostar.bean.result.EmployerInfoResult;
import com.sostar.bean.result.EmployerMyOrderResult;
import com.sostar.bean.result.SetEmployerOrderResult;
import com.sostar.dao.EmployerMyOrderDao;
import com.sostar.until.MyDateUtils;
import com.sostar.until.SqlUtils;
import org.apache.commons.httpclient.util.DateUtil;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liuyang on 2017/2/20.
 */
@Service
public class EmployerMyOrderService {
    @Autowired
    private EmployerMyOrderDao employerMyOrderDao;

    public PaginationResult<EmployerMyOrderResult> getEmployerMyOrderList(EmployerMyOrderParam param) {
        Page<EmployerMyOrderResult> page = SqlUtils.getPage(param);
        EmployerOrderEntity employerOrderEntity = new EmployerOrderEntity();
        employerOrderEntity.setUserId(param.getUserId());
        employerOrderEntity.setOrderStatus(param.getOrderType());
        employerMyOrderDao.getEmployerMyOrderList(employerOrderEntity);
        PaginationResult<EmployerMyOrderResult> paginationResult = new PaginationResult();
        paginationResult.setTotal(page.getTotal());
        paginationResult.setData(page.getResult());
        return paginationResult;
    }

    public boolean setEmployerOrder(SetEmployerOrderParam param) {
        SetEmployerOrderEntity setEmployerOrderEntity = new SetEmployerOrderEntity();
        //将照片数组转化成string保存
        String[] piclist = param.getPicListArray();
        String picList = "";
        if (piclist.length > 0) {
            for (int i = 0; i < piclist.length; i++) {
                picList = picList + piclist[i] + "#";
            }
            picList = picList.substring(0, picList.length() - 1);
        }
        //TODO BeanUtils.copyProperties()无效 后续优化
        setEmployerOrderEntity.setPicList(picList);

        setEmployerOrderEntity.setUserId(param.getUserId());
        setEmployerOrderEntity.setJobType(param.getJobType());
        setEmployerOrderEntity.setStartTime(param.getStartTime());
        setEmployerOrderEntity.setEndTime(param.getEndTime());
        //讲用工日期转化成string,并拆分出具体日期保存
        ArrayList<PeriodTime> periodTimelist = param.getPeriodTimeList();
        String periodTime = "";
        long leastTime = 0l;
        long biggestTime = 0l;
        if (!periodTimelist.isEmpty()) {
            for (int i = 0; i < periodTimelist.size(); i++) {
                long startDay = MyDateUtils.stringToLong("yyyy/MM/dd", periodTimelist.get(i).getStartTime());
                long startTime = MyDateUtils.stringToLong("yyyy/MM/dd HH:mm", periodTimelist.get(i).getStartTime() + " " + param.getStartTime());
                long endDay = MyDateUtils.stringToLong("yyyy/MM/dd", periodTimelist.get(i).getEndTime());
                long endTime = MyDateUtils.stringToLong("yyyy/MM/dd HH:mm", periodTimelist.get(i).getEndTime() + " " + param.getEndTime());
                int dayNum = (int) (endDay - startDay) / (24 * 3600 * 1000);
                for (int j = 0; j < dayNum + 1; j++) {
                    periodTime = periodTime + MyDateUtils.addDays("yyyy/MM/dd", periodTimelist.get(i).getStartTime(), j) + ",";
                }
                if (leastTime == 0 || leastTime > startTime) {
                    leastTime = startTime;
                }
                if (biggestTime == 0 || biggestTime < endTime) {
                    biggestTime = endTime;
                }
            }
            periodTime = periodTime.substring(0, periodTime.length() - 1);
        }
        setEmployerOrderEntity.setPeriodTime(periodTime);
        setEmployerOrderEntity.setLeastTime(new Date(leastTime));
        setEmployerOrderEntity.setLaggestTime(new Date(biggestTime));

        setEmployerOrderEntity.setStaffAccount(param.getStaffAccount());
        setEmployerOrderEntity.setUnitPrice(param.getUnitPrice());
        setEmployerOrderEntity.setUnitPriceType(param.getUnitPriceType());
        setEmployerOrderEntity.setPaymentType(param.getPaymentType());
        setEmployerOrderEntity.setSex(param.getSex());
        setEmployerOrderEntity.setAddress(param.getAddress());

        setEmployerOrderEntity.setConfirmFlg(param.getConfirmFlg());
        setEmployerOrderEntity.setDescription(param.getDescription());
        setEmployerOrderEntity.setOrderRange(param.getOrderRange());
        setEmployerOrderEntity.setLongitude(param.getLongitude());
        setEmployerOrderEntity.setLatitude(param.getLatitude());
        setEmployerOrderEntity.setOrderStatus(param.getOrderStatus());
        return employerMyOrderDao.setEmployerOrder(setEmployerOrderEntity) != 0;
    }

    public EmployerCashAvaiableResult getEmployerCashAvaiable(EmployerCashAvaiableParam param) {
        return employerMyOrderDao.getEmployerCashAvaiable(param);
    }

    public boolean setDraftToOrder(SetDraftToOrderParam param) {
        return employerMyOrderDao.setDraftToOrder(param) != 0;
    }

}
