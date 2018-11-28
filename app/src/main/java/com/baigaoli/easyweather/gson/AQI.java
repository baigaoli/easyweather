package com.baigaoli.easyweather.gson;


import com.google.gson.annotations.SerializedName;

/**
 * Created by likaisong on 2018/11/28.
 */

public class AQI {
    @SerializedName("city")
    public AQICity city;

    public class AQICity{
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
