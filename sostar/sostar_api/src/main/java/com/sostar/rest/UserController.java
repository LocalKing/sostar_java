package com.sostar.rest;

import com.framework.cache.CacheManager;
import com.sostar.bean.common.CommonParam;
import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.UserAccountInfo;
import com.sostar.bean.param.*;
import com.sostar.bean.result.UserLoginResult;
import com.sostar.dao.UserDao;
import com.sostar.service.EmployerCenterService;
import com.sostar.service.StaffCenterService;
import com.sostar.service.UserService;
import com.sostar.validator.ValidatorUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by mao_yejun on 2017/1/4.
 */
@RestController
@RequestMapping(value = "api")
@Api(value = "user-api",
        description = "用户操作API")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private StaffCenterService staffCenterService;
    @Autowired
    private EmployerCenterService employerCenterService;
    @Autowired
    private UserDao userDao;

    @ApiOperation(value = "登陆")
    @RequestMapping(value = "/user/login",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Response<UserLoginResult> userLogin(@RequestBody Request<UserLoginParam> request) {
        UserLoginParam param = request.getParam();
        Response<UserLoginResult> response = new Response<>();
        UserLoginResult result = new UserLoginResult();
        String phone = param.getPhone();
        if (!ValidatorUtil.validatorPhone(phone)) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("请输入正确的号码！");
            response.setData(result);
            return response;
        }
        UserAccountInfo userAccountInfo = userService.getUserAccountInfo(param);

        if (null != userAccountInfo && userAccountInfo.getPassword().equals(param.getPassword())) {
            CommonParam commonParam =new CommonParam();
            String userId= userAccountInfo.getUserId();
            commonParam.setUserId(userId);
            commonParam.setDeviceId(request.getDeviceId());
            commonParam.setPlatform(request.getPlatform());
            commonParam.setSysversion(request.getSysversion());
            commonParam.setVer(request.getVer());
            userService.updateCommParam(commonParam);
            result.setUserId(userId);
            result.setUserType(userAccountInfo.getUserType());
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage("登陆成功！");
            response.setData(result);
        } else {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("用户或密码不正确！");
            response.setData(result);
        }

        return response;
    }

    @ApiOperation(value = "注册")
    @RequestMapping(value = "/user/register",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Response<UserLoginResult> userRegister(@RequestBody Request<UserRegisterParam> request) {
        Response<UserLoginResult> response = new Response<>();
        UserLoginResult userLoginResult = new UserLoginResult();
        UserRegisterParam param = request.getParam();
        String captcha = param.getCaptcha();
        String phone = param.getPhone();
        if (!ValidatorUtil.validatorPhone(phone)) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("请输入正确的号码！");
            response.setData(userLoginResult);
            return response;
        }
        //验证是否注册过
        boolean hasRegister = userService.checkPhone(phone);
        if (hasRegister) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("该手机已被注册！");
            response.setData(userLoginResult);
            return response;
        }
        String cache = (String) CacheManager.getInstance().putListener().get(phone);
        //无敌注册码
        if ("123456".equals(captcha)) {
            String userId=userService.registerUser(request);
            userLoginResult.setUserId(userId);
            userLoginResult.setUserType(ConstantDef.USER_TYPE.UNCHOOSE);
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage("注册成功！");
            response.setData(userLoginResult);
            return response;
        }
        //
        if (StringUtils.isEmpty(cache) || !cache.equals(captcha)) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("验证码错误！");
            response.setData(userLoginResult);
            return response;
        } else {
            String userId=userService.registerUser(request);
            userLoginResult.setUserId(userId);
            userLoginResult.setUserType(ConstantDef.USER_TYPE.UNCHOOSE);
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage("注册成功！");
            response.setData(userLoginResult);
            return response;
        }
    }

    @ApiOperation(value = "重置密码")
    @RequestMapping(value = "/user/resetpass",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Response<HashMap> userResetPass(@RequestBody Request<PasswordResetParam> request) {
        Response<HashMap> response = new Response<>();
        PasswordResetParam param = request.getParam();
        String phone = param.getPhone();
        String captcha = param.getCaptcha();
        if (!ValidatorUtil.validatorPhone(phone)) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("请输入正确的号码！");
            response.setData(new HashMap<>());
            return response;
        }
        //无敌注册码
        if ("123456".equals(captcha)) {
            userService.userResetPass(param);
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage("密码重置成功！");
            response.setData(new HashMap<>());
            return response;
        }
        //
        String cache = (String) CacheManager.getInstance().putListener().get(phone);
        if (StringUtils.isEmpty(cache) || !cache.equals(captcha)) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("验证码错误！");
            response.setData(new HashMap<>());
            return response;
        }
        boolean rs = userService.userResetPass(param);
        if (rs) {
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage("密码重置成功！");
            response.setData(new HashMap<>());
        } else {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("密码重置失败！");
            response.setData(new HashMap<>());
        }
        return response;
    }


    @ApiOperation(value = "选择user类型")
    @RequestMapping(value = "/user/setUserType",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Response<HashMap> setUserType(@RequestBody Request<UserTypeParam> request) {
        Response<HashMap> response = new Response<>();
        UserTypeParam param = request.getParam();
        String userId = param.getUserId();
        boolean rsSetType = userService.setUserType(param);
        boolean rsSet = true;
        if (param.getUserType().equals("0")) {
            rsSet = userService.setStaffInfo(param);
        } else {
            rsSet = userService.setComapnyInfo(param);
        }
        if (null == userId || "" == userId) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("参数异常！");
            response.setData(new HashMap());
        } else {
            if (rsSetType && rsSet) {
                response.setResult(ConstantDef.RESPONSE.SUCCESS);
                response.setMessage("设置员工类型成功！");
                response.setData(new HashMap<>());
            } else {
                response.setResult(ConstantDef.RESPONSE.FAIL);
                response.setMessage("设置员工类型失败！");
                response.setData(new HashMap<>());
            }
        }
        return response;
    }
}