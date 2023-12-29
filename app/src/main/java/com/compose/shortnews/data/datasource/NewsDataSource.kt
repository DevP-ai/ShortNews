package com.compose.shortnews.data.datasource

import com.compose.shortnews.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    suspend fun getNewsHeadlineFromDataSource(country:String): Response<NewsResponse>
}