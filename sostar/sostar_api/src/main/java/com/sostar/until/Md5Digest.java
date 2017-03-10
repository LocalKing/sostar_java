package com.sostar.until;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by mao_yejun on 2017/1/9.
 */
public class Md5Digest {
    public static String digest(String code) {
        try {
            MessageDigest e = MessageDigest.getInstance("MD5");
            e.update(code.getBytes());
            return (new BigInteger(1, e.digest())).toString(16);
        } catch (NoSuchAlgorithmException var2) {
            throw new RuntimeException("MD5加密出现错误");
        }
    }
}