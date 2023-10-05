package com.example.ex10_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar

class MainActivity : AppCompatActivity() {

    lateinit var rbar_one : RatingBar
    lateinit var rbar_two : RatingBar
    lateinit var rbar_thr : RatingBar
    lateinit var btnInc : Button
    lateinit var btnDec : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rbar_one = findViewById(R.id.rbar_one)
        rbar_two = findViewById(R.id.rbar_two)
        rbar_thr = findViewById(R.id.rbar_thr)

        btnInc = findViewById(R.id.btnInc)
        btnDec = findViewById(R.id.btnDec)

        btnInc.setOnClickListener {
            rbar_one.rating = rbar_one.rating + rbar_one.stepSize
            rbar_two.rating = rbar_two.rating + rbar_two.stepSize
            rbar_thr.rating = rbar_thr.rating + rbar_thr.stepSize
        }

        btnDec.setOnClickListener {
            rbar_one.rating = rbar_one.rating - rbar_one.stepSize
            rbar_two.rating = rbar_two.rating - rbar_two.stepSize
            rbar_thr.rating = rbar_thr.rating - rbar_thr.stepSize
        }

    }
}