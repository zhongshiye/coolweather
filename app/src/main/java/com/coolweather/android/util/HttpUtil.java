package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 作者：zsy  创建日期：2021/6/6 15:22
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                                .url(address)
                                .build();
        client.newCall(request).enqueue(callback);

    }
}
