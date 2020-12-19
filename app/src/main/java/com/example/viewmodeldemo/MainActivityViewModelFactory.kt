package com.example.viewmodeldemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

//used to initialise the viewmodel with an argument in this case name: String

@Suppress("UNCHECKED_CAST")
class MainActivityViewModelFactory(private var name: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(name) as T
        }
        throw IllegalArgumentException("ViewModel not found")
    }
}