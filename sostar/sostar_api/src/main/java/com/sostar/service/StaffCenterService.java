package com.sostar.service;

import com.sostar.bean.param.*;
import com.sostar.bean.result.StaffCenterResult;
import com.sostar.bean.result.StaffDetailResult;
import com.sostar.dao.StaffCenterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mao_yejun on 2017/2/16.
 */
@Service
public class StaffCenterService {
    @Autowired
    private StaffCenterDao staffCenterDao;

    /**
     * 员工中心首页
     *
     * @param param
     * @return
     */
    public StaffCenterResult getStaffCenter(StaffCenterParam param) {
        StaffCenterResult staffCenterResult =staffCenterDao.getStaffCenter(param);
        if(staffCenterResult == null){
            return  new StaffCenterResult();
        }
        return staffCenterResult;
    }

    /**
     * 员工详情
     * @param param
     * @return
     */
    public StaffDetailResult getStaffDetail(StaffDetailParam param){
        return staffCenterDao.getStaffDetail(param);
    }

    /**
     * 员工认证
     */
    public boolean setStaffAuthentica(StaffAuthParam staffAuthParam) {
        return staffCenterDao.setStaffAuthentica(staffAuthParam) != 0;
    }

    /**
     * 员工信息
     */
    public boolean setStaffInfo(StaffInfoParam staffInfoParam) {
        return staffCenterDao.setStaffInfo(staffInfoParam) != 0;
    }
}
