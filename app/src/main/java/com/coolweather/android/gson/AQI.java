package com.coolweather.android.gson;

/**
 * Created by 刘祥 on 2017/4/11.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
