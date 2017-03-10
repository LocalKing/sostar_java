package com.sostar.service;


import com.sostar.config.CaptchaConfig;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * *SmsUtils
 * *@author mao_yejun
 * *@version 1.0
 **/
@Service
public class SmsService {
    private static Logger logger = LoggerFactory.getLogger(SmsService.class);
    @Autowired
    private CaptchaConfig captchaConfig;

    public boolean sendCaptchaMessage(String phone, String captcha) throws IOException {
        String message = String.format(captchaConfig.getText(), "用户", captcha, captchaConfig.getTime());
        HttpClient httpclient = new HttpClient();
        PostMethod post = new PostMethod(captchaConfig.getUrl());
        post.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
        post.addParameter("apikey", captchaConfig.getApikey());
        post.addParameter("text", message);
        post.addParameter("mobile", phone);
        int status = httpclient.executeMethod(post);
        String info = new String(post.getResponseBody(), "UTF-8");
        logger.debug(info);
        return status == 200;
    }


    /**
     * 创建指定数量的随机字符串
     *
     * @param numberFlag 是否是数字
     * @param length
     * @return
     */
    public static String createRandom(boolean numberFlag, int length) {
        String retStr = "";
        String strTable = numberFlag ? "1234567890" : "1234567890abcdefghijkmnpqrstuvwxyz";
        int len = strTable.length();
        boolean bDone = true;
        do {
            retStr = "";
            int count = 0;
            for (int i = 0; i < length; i++) {
                double dblR = Math.random() * len;
                int intR = (int) Math.floor(dblR);
                char c = strTable.charAt(intR);
                if (('0' <= c) && (c <= '9')) {
                    count++;
                }
                retStr += strTable.charAt(intR);
            }
            if (count >= 2) {
                bDone = false;
            }
        } while (bDone);

        return retStr;
    }
}
