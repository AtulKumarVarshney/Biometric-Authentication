package com.example.mvvm.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.utils.ConnectionDetector

class CheckInternetConnection(application: Application) : AndroidViewModel(application){

    var isConnected =MutableLiveData<Boolean>()
    private val context =  getApplication<Application>().applicationContext

    fun isOnline(): MutableLiveData<Boolean> {
        if(ConnectionDetector.isInternetAvailable(context)==true)
        {
             isConnected.value=true
        }else{
             isConnected.value =false
        }
        return isConnected

    }

}