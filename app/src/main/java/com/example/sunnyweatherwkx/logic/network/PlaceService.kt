package com.example.sunnyweatherwkx.logic.network

import com.example.sunnyweatherwkx.SunnyWeatherApplication
import com.example.sunnyweatherwkx.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")      //声明@GET注解，调用searchPlace时，Retrofit会发起一条GET请求，去访问@GET注解中配置的地址
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>        //将返回值自动从JSON数据解析成PlaceResponse对象
}