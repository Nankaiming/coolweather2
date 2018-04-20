package com.example.nankaiming.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nankaiming on 2018/4/15.
 */

public class Now {
	@SerializedName("tmp")
	public String temperature;
	public More more;
	public class More{
		@SerializedName("cond")
		public String info;
	}
}
