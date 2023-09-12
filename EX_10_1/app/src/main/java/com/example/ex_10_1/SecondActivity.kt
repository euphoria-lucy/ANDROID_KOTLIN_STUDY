package com.example.ex_10_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var btnSecond : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnSecond = findViewById(R.id.btnSecond)
        btnSecond.setOnClickListener {
            finish()
        }
    }
}