package com.aprisetiabudi.responsi.Services

import com.aprisetiabudi.responsi.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieAPIInterface {
    @GET("/3/movie/top_rated?api_key=bbf5a3000e95f1dddf266b5e187d4b21")
    fun getMovieList(): Call<MovieResponse>

}