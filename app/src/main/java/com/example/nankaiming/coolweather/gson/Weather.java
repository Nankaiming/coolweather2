package com.example.nankaiming.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nankaiming on 2018/4/15.
 */

public class Weather {
	public String status;
	public Basic basic;
	public AQI aqi;
	public Now now;
	public Suggestion suggestion;
	@SerializedName("daily_forecast")
	public List<ForeCast> foreCastList;
}
