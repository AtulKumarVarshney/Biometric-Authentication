package com.example.mvvm.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvm.data.ApiService.ApiService
import com.example.mvvm.data.Model.Model_UserInfo

class UserRepository(val apiService: ApiService) {

    val userInfoResult = MutableLiveData<Model_UserInfo>()
    val userInfo:LiveData<Model_UserInfo> get() = userInfoResult

   suspend fun getUserInfo(){

        val result = apiService.getSingleUser()
       if(result?.body()!=null)
       {
           userInfoResult.postValue(result.body())
       }
    }
}