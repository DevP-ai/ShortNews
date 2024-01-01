package com.compose.shortnews.data.api

import com.compose.shortnews.data.AppConstants.API_KEY
import com.compose.shortnews.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


//Here define all the functions of end points and can access all the end points


interface ApiService {

    @GET("top-headlines")
    suspend fun getNewsHeadline(
        @Query("country")country:String,
        @Query("apiKey")apiKey:String=API_KEY
    ):Response<NewsResponse>
}

//GET https://newsapi.org/v2/top-headlines?country=in&apiKey=782b4508b81a4eab9cf6f69934202d86