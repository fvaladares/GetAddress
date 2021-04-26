package com.example.mobile.getaddress.repository

import com.example.mobile.getaddress.model.ResultData

interface IMapsRepository {
    suspend fun searchAddress(): List<ResultData>
}