package com.example.ex_10_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {

    lateinit var btnThird : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        btnThird = findViewById(R.id.btnThird)
        btnThird.setOnClickListener {
            finish()
        }

    }
}