package com.example.mvvm.data.ApiService

import com.example.mvvm.data.Model.Model_UserInfo
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("api/users/2")
    suspend fun getSingleUser() :Response<Model_UserInfo>
}