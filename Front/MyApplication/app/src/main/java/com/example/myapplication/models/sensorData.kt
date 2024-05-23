package com.example.myapplication.models

import com.google.gson.annotations.SerializedName

data class sensorData (
    @SerializedName("id") val id: Int,
    @SerializedName("date") val date: String,
    @SerializedName("port") val port: Int,
    @SerializedName("sensor_data") val sensor_data: String,
    @SerializedName("sensor_id") val sensor_id: String,
    @SerializedName("sensor_type") val sensor_type: String
)