package com.compose.shortnews

import android.app.Application
import android.widget.Toast
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this,"Application Class",Toast.LENGTH_SHORT).show()
    }
}