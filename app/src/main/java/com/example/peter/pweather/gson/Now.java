package com.example.peter.pweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Peter on 2017/4/26.
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
