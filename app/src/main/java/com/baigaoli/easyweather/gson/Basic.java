package com.baigaoli.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by likaisong on 2018/11/28.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
 }
