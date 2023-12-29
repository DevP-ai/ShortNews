package com.compose.shortnews.ui.repository

import  com.compose.shortnews.data.datasource.NewsDataSource
import com.compose.shortnews.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsDataSource: NewsDataSource
){
    suspend fun getNewsHeadlineFromDataSource(country:String):Response<NewsResponse>{
        return newsDataSource.getNewsHeadlineFromDataSource(country)
    }
}