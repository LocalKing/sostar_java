package com.sostar.dao;

import com.sostar.bean.param.*;
import com.sostar.bean.result.StaffCenterResult;
import com.sostar.bean.result.StaffDetailResult;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by mao_yejun on 2017/2/16.
 */
@Mapper
public interface StaffCenterDao {
    StaffCenterResult getStaffCenter(StaffCenterParam param);
    StaffDetailResult getStaffDetail(StaffDetailParam param);
    int setStaffAuthentica(StaffAuthParam param);
    int setStaffInfo(StaffInfoParam param);

}
