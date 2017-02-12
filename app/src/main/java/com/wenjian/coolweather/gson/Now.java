package com.wenjian.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wenjian on 2017/2/11.
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
