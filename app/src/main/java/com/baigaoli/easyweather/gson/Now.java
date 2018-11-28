package com.baigaoli.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by likaisong on 2018/11/28.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
