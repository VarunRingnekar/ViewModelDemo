package com.example.viewmodeldemo

import android.util.Log
import androidx.lifecycle.ViewModel

//used to store data outside of the UI controller to prevent data loss on configuration change

class MainActivityViewModel(var name: String) : ViewModel() {

    var number = 0
    var myName = name

    init {
        Log.i("MainActivityViewModel", "Hello Welcome to $name's session")
    }

    fun addNumber(){
        number++
    }

}