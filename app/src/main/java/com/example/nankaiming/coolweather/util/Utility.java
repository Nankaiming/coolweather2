package com.example.nankaiming.coolweather.util;

import android.text.TextUtils;
import android.util.Log;

import com.example.nankaiming.coolweather.db.City;
import com.example.nankaiming.coolweather.db.County;
import com.example.nankaiming.coolweather.db.Province;
import com.example.nankaiming.coolweather.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by nankaiming on 2018/4/13.
 */

public class Utility {
	public static Weather handleWeatherResponse(String response){
		try {
			JSONObject jsonObject = new JSONObject(response);
			JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
			String weatherContent = jsonArray.getJSONObject(0).toString();
			return new Gson().fromJson(weatherContent, Weather.class);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static boolean handleProvinceResponse(String response){
		if(!TextUtils.isEmpty(response)){
			try {
				JSONArray allProvince = new JSONArray(response);
				for(int i = 0; i < allProvince.length(); i++){
					JSONObject provinceObject = allProvince.getJSONObject(i);
					Province province = new Province();
					province.setProvinceCode(provinceObject.getInt("id"));
					province.setProvinceName(provinceObject.getString("name"));
					province.save();
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}
	public static boolean handleCityResponse(String response, int provinceId){
		if(!TextUtils.isEmpty(response)){
			try {
				JSONArray allCity = new JSONArray(response);
				for(int i = 0; i < allCity.length(); i++){
					JSONObject cityObject = allCity.getJSONObject(i);
					City city = new City();
					city.setCityCode(cityObject.getInt("id"));
					city.setCityName(cityObject.getString("name"));
					city.setProvinceId(provinceId);
					city.save();
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}
	public static boolean handleCountyResponse(String response, int cityId){
		if(!TextUtils.isEmpty(response)){
			try {
				JSONArray allCounty = new JSONArray(response);
				for(int i = 0; i < allCounty.length(); i++){
					JSONObject countyObject = allCounty.getJSONObject(i);
					County county = new County();
					county.setCityId(cityId);
					county.setCountyName(countyObject.getString("name"));
					county.setWeatherId(countyObject.getString("weather_id"));
					county.save();
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}
}
