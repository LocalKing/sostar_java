package com.sostar.validator;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by mao_yejun on 2017/2/13.
 */
public class ValidatorUtil {
    /**
     * 校验电话的正则表达式
     */
    private static final String PHONE_REGEX = "^(\\d{3,4}-?)?\\d{7,9}$";

    /**
     * 验证指定的字段值是否合法电话
     *
     * @param value 验证的数据
     */
    public static boolean validatorPhone(String value) {
        if (validatorRequired(value)) {
            return false;
        }
        return isPhone(value);
    }

    /**
     * 电话号码验证
     *
     * @param value
     * @return
     */
    public final static boolean isPhone(String value) {
        return checkPattern(value, PHONE_REGEX);
    }

    /**
     * 正则表达式检验
     *
     * @param value 验证的数据
     * @param regex 正则表达式
     * @return
     */
    public static boolean checkPattern(String value, String regex) {
        if (isNull(value) || isNull(regex)) {
            return false;
        }
        return RegexUtils.matchs(regex, value);
    }

    /**
     * 判断数据是否为空
     *
     * @param value 验证的数据
     * @return
     */
    public static boolean isNull(Object value) {
        boolean isEmpty = false;
        if (value == null) {
            isEmpty = true;
        } else if (value.getClass().isArray() && ArrayUtils.isEmpty((Object[]) value)) {
            isEmpty = true;
        } else if (value instanceof String && StringUtils.isEmpty((String) value)) {
            isEmpty = true;
        } else if (value instanceof List && CollectionUtils.isEmpty((List) value)) {
            isEmpty = true;
        } else if (value instanceof Map && ((Map) value).size() == 0) {
            isEmpty = true;
        }
        return isEmpty;
    }

    /**
     * 验证指定的字段值是否为空
     *
     * @param value 验证的数据
     * @return
     */
    public static boolean validatorRequired(Object value) {
        boolean isNull = false;
        if (isNull(value)) {
            isNull = true;
        }
        return isNull;
    }
}
