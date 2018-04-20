package com.example.nankaiming.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nankaiming on 2018/4/15.
 */

public class AQI {
	@SerializedName("city")
	public AQICity city;
	public class AQICity{
		public String aqi;
		public String pm25;
	}
}
