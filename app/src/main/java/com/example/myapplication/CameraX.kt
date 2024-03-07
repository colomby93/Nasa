package com.example.myapplication


import com.google.gson.annotations.SerializedName

data class CameraX(
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("name")
    val name: String
)