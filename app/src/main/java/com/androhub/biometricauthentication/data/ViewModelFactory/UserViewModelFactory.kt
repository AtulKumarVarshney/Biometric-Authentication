package com.example.mvvm.data.ViewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.data.repository.UserRepository
import com.example.mvvm.viewmodel.UserViewModel

class UserViewModelFactory(var userRepository: UserRepository) :ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return UserViewModel(userRepository) as T
    }
}