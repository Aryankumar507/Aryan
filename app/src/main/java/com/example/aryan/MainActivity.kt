package com.example.aryan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         Handler(Looper.getMainLooper()).postDelayed({
             startActivity(Intent(this,WebViewActivity::class.java))
             finish()
         },3000)
    }
}