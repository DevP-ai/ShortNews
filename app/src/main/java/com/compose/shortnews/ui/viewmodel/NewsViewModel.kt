package com.compose.shortnews.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.compose.shortnews.ui.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository
):ViewModel() {

    fun getNews(country:String){
        viewModelScope.launch(Dispatchers.IO){
             newsRepository.getNewsHeadlineFromDataSource(country)
                 .collectLatest {newsResponse->

                 }
        }
    }

    companion object{
        const val TAG="NewsViewModel"
    }
}