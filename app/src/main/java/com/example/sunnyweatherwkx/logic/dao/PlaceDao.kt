package com.example.sunnyweatherwkx.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.example.sunnyweatherwkx.SunnyWeatherApplication
import com.example.sunnyweatherwkx.logic.model.wkx_Place

object PlaceDao {
    fun savePlace(place: wkx_Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))        //用字符串存储的方式来保存数据
        }
    }

    fun getSavedPlace(): wkx_Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, wkx_Place::class.java)
    }

    //判断是否有数据已经被存储
    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}