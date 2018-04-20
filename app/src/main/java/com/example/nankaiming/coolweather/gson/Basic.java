package com.example.nankaiming.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nankaiming on 2018/4/15.
 */

public class Basic {
	@SerializedName("city")
	public String cityName;
	@SerializedName("id")
	public String weatherId;
	@SerializedName("id")
	public Update update;
	public class Update{
		@SerializedName("loc")
		public String updateTime;
	}
}
