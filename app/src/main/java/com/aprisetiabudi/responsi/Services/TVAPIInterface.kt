package com.aprisetiabudi.responsi.Services

import com.aprisetiabudi.responsi.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVAPIInterface {
    @GET("/3/tv/top_rated?api_key=bbf5a3000e95f1dddf266b5e187d4b21")
    fun getTVList(): Call<TVResponse>

}