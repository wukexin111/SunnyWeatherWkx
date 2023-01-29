package com.example.sunnyweatherwkx.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<wkx_Place>)

data class wkx_Place(
    val name: String, val location: wkx_Location,
    @SerializedName("formatted_address") val address: String
)    //使用了@SerializedName注解的方式，来让JSON字段和Kotlin字段之间建立映射关系

data class wkx_Location(val lng: String, val lat: String)