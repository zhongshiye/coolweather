package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：zsy  创建日期：2021/6/7 10:24
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }


}
