package com.sostar.service;

import com.sostar.bean.UserAccountInfo;
import com.sostar.bean.common.CommonParam;
import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.entity.UserAccountEntity;
import com.sostar.bean.entity.UserEntity;
import com.sostar.bean.param.PasswordResetParam;
import com.sostar.bean.param.UserLoginParam;
import com.sostar.bean.param.UserRegisterParam;
import com.sostar.bean.param.UserTypeParam;
import com.sostar.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by mao_yejun on 2017/1/4.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 登陆
     *
     * @param userLoginParam
     * @return
     */
    public UserAccountInfo getUserAccountInfo(UserLoginParam userLoginParam) {
        return userDao.getUserAccount(userLoginParam.getPhone());
    }

    /**
     * 用户注册
     *
     * @param request
     */
    @Transactional
    public java.lang.String registerUser( Request<UserRegisterParam> request) {
        UserRegisterParam userRegisterParam =request.getParam();
        UserEntity userEntity = new UserEntity();
        userEntity.setUserType(ConstantDef.USER_TYPE.UNCHOOSE);
        userEntity.setCrtTime(new Date());
        userEntity.setMsgFlg(ConstantDef.MSG_FLG.ON);
        userEntity.setDeviceId(request.getDeviceId());
        userEntity.setPlatform(request.getPlatform());
        userEntity.setSysversion(request.getSysversion());
        userEntity.setVer(request.getVer());
        userDao.registerUser(userEntity);
        String userId = userEntity.getUserId().toString();
        UserAccountEntity userAccountEntity = new UserAccountEntity();
        userAccountEntity.setUserId(userId);
        userAccountEntity.setPhone(userRegisterParam.getPhone());
        userAccountEntity.setPassword(userRegisterParam.getPassword());
        userDao.registerUserAccount(userAccountEntity);
        String phoneId = userAccountEntity.getPhoneId();
        userDao.updatePhoneid(phoneId,userId);
        return userId;
    }

    /**
     * 电话号码验证是否已经注册过
     *
     * @param phone
     * @return
     */
    public boolean checkPhone(String phone) {
        return userDao.checkPhone(phone) != 0;
    }

    public boolean userResetPass(PasswordResetParam param) {

        return userDao.userResetPass(param) != 0;
    }

    public boolean setUserType(UserTypeParam param) {

        return userDao.setUserType(param) != 0;
    }

    public boolean setStaffInfo(UserTypeParam param) {

        return userDao.setStaffInfo(param) != 0;
    }

    public boolean setComapnyInfo(UserTypeParam param) {

        return userDao.setComapnyInfo(param) != 0;
    }

    public boolean updateCommParam(CommonParam commonParam){
        return userDao.updateCommParam(commonParam) != 0;
    }
}
