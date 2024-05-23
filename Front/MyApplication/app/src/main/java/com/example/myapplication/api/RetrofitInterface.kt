package com.example.myapplication.api

import com.example.myapplication.models.sensorData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body

interface RetrofitInterface {
    @GET("/api/todos")
    fun getAllToDos(): Call<List<sensorData>>

    @POST("/api/todos")
    fun createToDo(@Body toDo: sensorData): Call<sensorData>
}