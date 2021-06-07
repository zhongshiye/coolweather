package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：zsy  创建日期：2021/6/7 10:35
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
