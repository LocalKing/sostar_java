package com.sostar.rest;

import com.framework.cache.CacheManager;
import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.param.CaptchaGetParam;
import com.sostar.config.CaptchaConfig;
import com.sostar.service.SmsService;
import com.sostar.validator.ValidatorUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;

/**
 * 短信发送Rest Controller
 *
 * @author mao_yejun
 */
@RestController
@RequestMapping("api")
@Api(value = "Message-Api", description = "短信发送相关API")
public class CaptchaRestController {
    @Autowired
    private SmsService smsService;
    @Autowired
    private CaptchaConfig captchaConfig;

    /**
     * 发送短信验证码
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/verification/get", method = RequestMethod.POST)
    @ApiOperation(notes = "发送短信验证码", httpMethod = "POST", value = "发送短信验证码")
    public Response<HashMap> sendCaptchaMessage(@RequestBody Request<CaptchaGetParam> request) {
        CaptchaGetParam param = request.getParam();
        Response<HashMap> response = new Response<>();
        String mobile = param.getPhone();
        if(!ValidatorUtil.validatorPhone(mobile)){
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("请输入正确的号码！");
            response.setData(new HashMap());
            return response;
        }
        String captcha = SmsService.createRandom(Boolean.TRUE, 6);
        boolean rs = false;
        try {
            rs = smsService.sendCaptchaMessage(mobile, captcha);
        } catch (IOException e) {
            response.setResult("0");
            response.setMessage("验证码发送失败！");
            response.setData(new HashMap());
        }
        if (rs) {
            CacheManager.getInstance().putListener().put(mobile, captcha, Long.parseLong(captchaConfig.getTime()));
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage("验证码发送成功！");
            response.setData(new HashMap());
        } else {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("验证码发送失败！");
            response.setData(new HashMap());
        }
        return response;
    }
}
