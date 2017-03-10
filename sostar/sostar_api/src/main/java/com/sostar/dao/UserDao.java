package com.sostar.dao;

import com.sostar.bean.UserAccountInfo;
import com.sostar.bean.common.CommonParam;
import com.sostar.bean.common.Request;
import com.sostar.bean.entity.UserAccountEntity;
import com.sostar.bean.entity.UserEntity;
import com.sostar.bean.param.PasswordResetParam;
import com.sostar.bean.param.UserRegisterParam;
import com.sostar.bean.param.UserTypeParam;
import com.sostar.bean.result.UserLoginResult;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;

/**
 * Created by mao_yejun on 2017/1/4.
 */
@Mapper
public interface UserDao {
    UserAccountInfo getUserAccount(String phone);

    int registerUser(UserEntity userEntity);

    int registerUserAccount(UserAccountEntity userAccountEntity);

    int checkPhone(String phone);

    int userResetPass(PasswordResetParam passwordResetParam);

    int setUserType(UserTypeParam userTypeParam);

    int setStaffInfo(UserTypeParam userTypeParam);

    int setComapnyInfo(UserTypeParam userTypeParam);

    int updateDeviceid(String deviceId, String phone);

    int updatePhoneid(String phoneId, String userId);

    int updateCommParam(CommonParam param);
}
