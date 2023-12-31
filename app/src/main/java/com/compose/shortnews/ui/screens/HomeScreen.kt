package com.compose.shortnews.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.compose.shortnews.ui.viewmodel.NewsViewModel
import com.compose.utilities.ResourceState


const val TAG="HomeScreen"
@Composable
fun HomeScreen(
    newsViewModel:NewsViewModel= hiltViewModel()
){
//    val newsResponse=newsViewModel.news.collectAsState()

    val newsRes by newsViewModel.news.collectAsState()

    Surface(
        modifier = Modifier.fillMaxSize()
    ){
       when(newsRes){
           is ResourceState.Loading->{
               Log.d(TAG,"Inside_Loading..")
           }
           is ResourceState.Success->{

           }
           is ResourceState.Error->{

           }
       }
    }
}



@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
