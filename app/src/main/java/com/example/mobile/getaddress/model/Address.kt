package com.example.mobile.getaddress.model

import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("formatted_address")
    val formattedAddress: String
)
