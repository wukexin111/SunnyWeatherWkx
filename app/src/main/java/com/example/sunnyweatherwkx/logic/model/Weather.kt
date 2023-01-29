package com.example.sunnyweatherwkx.logic.model

//用于将Realtime和Daily对象封装起来
data class Weather(val realtime:wkx_RealtimeResponse.Realtime, val daily:DailyResponse.Daily)
