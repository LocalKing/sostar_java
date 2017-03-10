package com.sostar.dao;

import com.sostar.bean.param.SysUserTypeSetParam;
import com.sostar.bean.param.SystemParam;
import com.sostar.bean.param.SystemSearchParam;
import com.sostar.bean.result.SysUserTypeSet;
import com.sostar.bean.result.SysUserTypeSetResult;
import com.sostar.bean.result.SystemSearchResult;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by mao_yejun on 2017/2/22.
 */
@Mapper
public interface SystemDao {
    int restStaffRange(SystemParam systemParam);

    int restEmployerRange(SystemParam systemParam);

    SystemSearchResult searchEmployerSystem(SystemSearchParam param);
    SystemSearchResult searchStaffSystem(SystemSearchParam param);
    int resetSys(SystemParam systemParam);
    SystemSearchResult searchSystem(SystemSearchParam param);
    SysUserTypeSet searchByUserType(SysUserTypeSetParam param);
    SysUserTypeSet getIsCreate(SysUserTypeSet param);
    int updateCurrentUserId(String phoneId,String userId);
}
