package com.example.sunnyweatherwkx.logic.model

import com.google.gson.annotations.SerializedName

data class wkx_RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(
        val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuility
    )

    data class AirQuility(val aqi: AQI)

    data class AQI(val chn: Float)
}