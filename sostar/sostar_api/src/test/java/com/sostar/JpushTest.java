package com.sostar;

import cn.jpush.api.push.PushResult;
import com.sostar.until.JpushUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyang on 2017/2/28.
 */
public class JpushTest {
    public static void main(String[] args){
        List<String> aliasList = new ArrayList<>();
        aliasList.add("12");
        PushResult rs = JpushUtils.sendJpushMsg("你好德龙 大煞笔",aliasList,"1","ios",null);
    }
}
