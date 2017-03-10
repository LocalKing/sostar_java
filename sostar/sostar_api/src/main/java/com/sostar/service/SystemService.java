package com.sostar.service;

import com.sostar.bean.common.CommonParam;
import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.entity.UserEntity;
import com.sostar.bean.param.SysUserTypeSetParam;
import com.sostar.bean.param.SystemParam;
import com.sostar.bean.param.SystemSearchParam;
import com.sostar.bean.result.SysUserTypeSet;
import com.sostar.bean.result.SysUserTypeSetResult;
import com.sostar.bean.result.SystemSearchResult;
import com.sostar.bean.result.UserLoginResult;
import com.sostar.dao.SystemDao;
import com.sostar.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by mao_yejun on 2017/2/22.
 */
@Service
public class SystemService {
    @Autowired
    private SystemDao systemDao;
@Autowired
private UserDao userDao;
    public boolean restSystemRange(SystemParam systemParam) {
        return systemDao.resetSys(systemParam) != 0;
    }

    public SystemSearchResult searchSystem(SystemSearchParam param) {
        return systemDao.searchSystem(param);
    }
    @Transactional
    public SysUserTypeSetResult restSysUserType(Request<SysUserTypeSetParam> request){
        SysUserTypeSetParam param =request.getParam();
        SysUserTypeSetResult rs =new SysUserTypeSetResult();
        //根据用户id查找对应用户对应信息获得PhoneId
        SysUserTypeSet sysUserTypeSet = systemDao.searchByUserType(param);
        String phoneId= sysUserTypeSet.getPhoneId();
       //check该类型用户是否被创建过
        sysUserTypeSet.setUserType(param.getUserType());
        SysUserTypeSet  check = systemDao.getIsCreate(sysUserTypeSet);
        if(check == null){
            //未创建进行创建
            UserEntity userEntity = new UserEntity();
            userEntity.setUserType(param.getUserType());
            userEntity.setCrtTime(new Date());
            userEntity.setMsgFlg(ConstantDef.MSG_FLG.ON);
            userEntity.setPhoneId(sysUserTypeSet.getPhoneId());
            userDao.registerUser(userEntity);
            systemDao.updateCurrentUserId(phoneId,userEntity.getUserId().toString());
            rs.setUserId(userEntity.getUserId().toString());
            rs.setUserType(userEntity.getUserType());
        }else {
            //如果已经有了则进行用户切换
            systemDao.updateCurrentUserId(phoneId,check.getUserId());
            rs.setUserId(check.getUserId());
            rs.setUserType(check.getUserType());
        }
        CommonParam commonParam =new CommonParam();
        commonParam.setUserId(rs.getUserId());
        commonParam.setDeviceId(request.getDeviceId());
        commonParam.setPlatform(request.getPlatform());
        commonParam.setSysversion(request.getSysversion());
        commonParam.setVer(request.getVer());
        userDao.updateCommParam(commonParam);
        return rs;

    }
}
