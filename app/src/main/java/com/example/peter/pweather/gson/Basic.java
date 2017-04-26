package com.example.peter.pweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Peter on 2017/4/26.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
