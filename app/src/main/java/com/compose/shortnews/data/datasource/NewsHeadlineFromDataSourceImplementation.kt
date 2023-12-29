package com.compose.shortnews.data.datasource

import com.compose.shortnews.data.api.ApiService
import com.compose.shortnews.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsHeadlineFromDataSourceImplementation @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {
    override suspend fun getNewsHeadlineFromDataSource(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadline(country)
    }
}