package com.example.nankaiming.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by nankaiming on 2018/4/12.
 */

public class City extends DataSupport {
	private int id;
	private String cityName;
	private int cityId;
	private int provinceId;

	public int getId() {
		return id;
	}

	public String getCityName() {
		return cityName;
	}

	public int getCityId() {
		return cityId;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
}
