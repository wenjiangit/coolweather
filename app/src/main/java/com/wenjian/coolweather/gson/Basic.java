package com.wenjian.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wenjian on 2017/2/11.
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
