package com.sookmyung.kotlinbasic01_songyee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // 코틀린이 activity_main과 함께 동작한다는 뜻
    }
}