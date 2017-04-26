package com.example.peter.pweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * Created by Peter on 2017/4/26.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;



}
