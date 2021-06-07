package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：zsy  创建日期：2021/6/7 10:45
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
