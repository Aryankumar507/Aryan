package com.example.aryan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aryan.databinding.ActivityMainBinding

class WebView : AppCompatActivity() {
     private val binding: ActivityMainBinding by lazy {
         ActivityMainBinding.inflate(layoutInflater)
     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}