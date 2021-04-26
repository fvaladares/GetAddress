package com.example.mobile.getaddress.api

import com.example.mobile.getaddress.model.ResultData
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WebService {
    private val api: MapsApi =
        Retrofit.Builder()
            .baseUrl(endPointUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MapsApi::class.java)

    suspend fun getAddress(): Response<MutableList<ResultData>> = api.getAddresses()

    companion object {
        private const val endPointUrl = "https://maps.googleapis.com/maps/api/geocode/"
    }
}




