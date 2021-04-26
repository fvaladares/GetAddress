package com.example.mobile.getaddress.api

import com.example.mobile.getaddress.model.ResultData
import retrofit2.Response

interface MapsApi {

    suspend fun getAddresses(): Response<MutableList<ResultData>>
}