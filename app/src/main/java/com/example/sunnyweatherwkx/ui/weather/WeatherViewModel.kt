package com.example.sunnyweatherwkx.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweatherwkx.logic.Repository
import com.example.sunnyweatherwkx.logic.model.wkx_Location

class WeatherViewModel :ViewModel() {
    private val locationLiveData = MutableLiveData<wkx_Location>()

    //用于保证在手机屏幕发声旋转时不会丢失
    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat)
    }

    fun refreshWeather(lgn: String, lat: String) {
        locationLiveData.value = wkx_Location(lgn, lat)
    }
}