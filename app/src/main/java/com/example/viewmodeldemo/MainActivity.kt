package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = "Varun"

        //creating viewmodel instance using viewmodel factory
        var viewModelFactory = MainActivityViewModelFactory(name)

        var viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)

        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.score_text)

        textView.text = viewModel.number.toString()

        button.setOnClickListener{
            viewModel.addNumber()
            textView.text = viewModel.number.toString()
        }
    }
}