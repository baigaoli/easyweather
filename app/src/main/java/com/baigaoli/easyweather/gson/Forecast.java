package com.baigaoli.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by likaisong on 2018/11/28.
 */

public class Forecast {
    @SerializedName("date")
    public String date;

    @SerializedName("tmp")
    public TemperaTure temperaTure;

    @SerializedName("cond")
    public More more;

    public class TemperaTure{
        @SerializedName("max")
        public String max;

        @SerializedName("min")
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
