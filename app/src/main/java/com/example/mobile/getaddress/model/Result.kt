package com.example.mobile.getaddress.model

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("status")
    val status: String,
    @SerializedName("formatted_address")
    val formattedAddress: String

)
