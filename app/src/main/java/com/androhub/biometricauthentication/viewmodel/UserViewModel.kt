package com.example.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.data.Model.Model_UserInfo
import com.example.mvvm.data.repository.UserRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class UserViewModel(val userRepository: UserRepository) : ViewModel() {

    init {
        GlobalScope.launch {
            userRepository.getUserInfo()
        }
    }
    val userInfo : LiveData<Model_UserInfo> get() =userRepository.userInfo
}