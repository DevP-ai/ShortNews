package com.compose.shortnews.ui.repository

import  com.compose.shortnews.data.datasource.NewsDataSource
import com.compose.shortnews.data.entity.NewsResponse
import com.compose.utilities.ResourceState
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsDataSource: NewsDataSource
) {

    //    suspend fun getNewsHeadlineFromDataSource(country:String):Response<NewsResponse>{
//        return newsDataSource.getNewsHeadlineFromDataSource(country)
//    }

    suspend fun getNewsHeadlineFromDataSource(country: String): kotlinx.coroutines.flow.Flow<ResourceState<NewsResponse>>{
        return flow {
            emit(ResourceState.Loading())
            val response = newsDataSource.getNewsHeadlineFromDataSource(country)

            if(response.isSuccessful && response.body() !=null){
                emit(ResourceState.Success(response.body()!!))
            }else{
                emit(ResourceState.Error("Error fetching news data"))
            }
        }.catch { e->
            emit(ResourceState.Error(e?.localizedMessage?:"Some error in flow"))
        }
    }
}