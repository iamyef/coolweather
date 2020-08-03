package com.ccb.coolweather.util2;

/**
 * Created by cp on 2020-7-31.
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by cp on 2020-7-31.
 */

public class HttpUtil2{
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Build().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}