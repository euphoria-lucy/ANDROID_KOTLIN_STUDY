package com.example.framelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    lateinit var btn_one : Button
    lateinit var btn_two : Button
    lateinit var btn_thr : Button
    lateinit var l_one : LinearLayout
    lateinit var l_two : LinearLayout
    lateinit var l_thr : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_one = findViewById(R.id.btn_one)
        btn_two = findViewById(R.id.btn_two)
        btn_thr = findViewById(R.id.btn_thr)
        l_one = findViewById(R.id.l_one)
        l_two = findViewById(R.id.l_two)
        l_thr = findViewById(R.id.l_thr)
        btn_one.setOnClickListener(btnListener)
        btn_two.setOnClickListener(btnListener)
        btn_thr.setOnClickListener(btnListener)
    }

    var btnListener = OnClickListener {
        l_one.visibility = View.INVISIBLE
        l_two.visibility = View.INVISIBLE
        l_thr.visibility = View.INVISIBLE

        when(it.id) {
            R.id.btn_one -> l_one.visibility = View.VISIBLE
            R.id.btn_two -> l_two.visibility = View.VISIBLE
            R.id.btn_thr -> l_thr.visibility = View.VISIBLE
        }
    }
}