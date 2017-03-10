package com.sostar.until;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.*;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.jpush.api.push.model.notification.PlatformNotification.ALERT;

/**
 * Created by liuyang on 2017/2/27.
 */
public class JpushUtils {
    private static final String APP_KEY = "a8e8f82096aba5758f32776b";
    private static final String MASTER_SECRET = "d311c59747521472501e25b7";

    public static PushResult sendJpushMsg(String msg, List<String> aliasList, String type, String platform, String orderId) {
        JPushClient jpushClient = new JPushClient(MASTER_SECRET, APP_KEY, null, ClientConfig.getInstance());
        Map<String, String> extras = new HashMap<String, String>();
        // 添加信息:msg 消息内容 type：1,订单推送 2，系统推送
        extras.put("type", type);
        if(type.equals("1")){
            extras.put("orderId", orderId + "");
        }
        if (platform.equals("android")) {
            PushPayload payload = buildPushObject_all_alias_alert(msg, extras, aliasList);
            try {
                PushResult result = jpushClient.sendPush(payload);
                return result;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (platform.equals("ios")) {
            PushPayload payload = buildPushObject_ios_alias_alert(msg, extras, aliasList);
            try {
                PushResult result = jpushClient.sendPush(payload);
                return result;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 透传android
     */
    public static PushPayload buildPushObject_all_alias_alert(String msg, Map<String, String> extras, List<String> aliasList) {
        return PushPayload.newBuilder()
                .setPlatform(Platform.android())
                .setMessage(Message.newBuilder().setMsgContent(msg).addExtras(extras).build())
                .setAudience(Audience.alias(aliasList))
                .build();
    }

    /**
     * 推送ios
     */
    public static PushPayload buildPushObject_ios_alias_alert(String msg, Map<String, String> extras, List<String> aliasList) {
        return PushPayload.newBuilder()
                .setPlatform(Platform.ios())
                .setNotification(Notification
                        .newBuilder()
                        .setAlert(msg)
                        .addPlatformNotification(IosNotification.newBuilder().addExtras(extras).build())
                        .build())
                .setAudience(Audience.alias(aliasList))
//                .setOptions(Options.newBuilder().setApnsProduction(false).build())
                .build();
    }
}
