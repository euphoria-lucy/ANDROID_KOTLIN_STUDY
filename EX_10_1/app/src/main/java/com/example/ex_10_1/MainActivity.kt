package com.example.ex_10_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    lateinit var btnMain : Button
    lateinit var rg : RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMain = findViewById(R.id.btnMain)
        rg = findViewById(R.id.rg)

        btnMain.setOnClickListener {
            var intent = Intent(applicationContext, SecondActivity::class.java)
            if (rg.checkedRadioButtonId == R.id.rb_two) {
                intent = Intent(applicationContext, SecondActivity::class.java)
            } else {
                intent = Intent(applicationContext, ThirdActivity::class.java)
            }

        }

    }
}