package com.example.myapplication


import com.google.gson.annotations.SerializedName

data class NasaDto(
    @SerializedName("photos")
    val photos: List<Photo>
)