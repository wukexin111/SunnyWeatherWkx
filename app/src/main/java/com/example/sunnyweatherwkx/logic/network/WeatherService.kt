package com.example.sunnyweatherwkx.logic.network


import com.example.sunnyweatherwkx.SunnyWeatherApplication
import com.example.sunnyweatherwkx.logic.model.DailyResponse
import com.example.sunnyweatherwkx.logic.model.wkx_RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng")lng:String, @Path("lat")lat:String):
            Call<wkx_RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng")lng:String, @Path("lat")lat:String):        //@Path注解用于请求接口中动态传入经纬度的坐标
            Call<DailyResponse>
}