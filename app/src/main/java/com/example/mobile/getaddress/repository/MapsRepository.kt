package com.example.mobile.getaddress.repository

import com.example.mobile.getaddress.model.ResultData

class MapsRepository : IMapsRepository {
    override suspend fun searchAddress(): List<ResultData> {
        return searchAddress()
    }
}