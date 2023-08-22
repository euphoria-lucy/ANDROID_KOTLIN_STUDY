package com.example.optionmenutest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    lateinit var linear : LinearLayout
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "배경색과 버튼 변경"
        linear = findViewById(R.id.linear)
        btn = findViewById(R.id.btn_one)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
        return true
    }

}