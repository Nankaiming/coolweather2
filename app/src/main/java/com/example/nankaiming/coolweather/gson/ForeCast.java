package com.example.nankaiming.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nankaiming on 2018/4/15.
 */

public class ForeCast {
	public String date;
	@SerializedName("tmp")
	public Temperature temperature;
	@SerializedName("cond")
	public More more;
	public class Temperature{
		public String max;
		public String min;
	}
	public class More{
		@SerializedName("txt_d")
		public String info;
	}
}
