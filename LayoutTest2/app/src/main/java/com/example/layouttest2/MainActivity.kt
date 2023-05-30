package com.example.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linear1 = LinearLayout(this)
        linear1.orientation = LinearLayout.VERTICAL
        linear1.setBackgroundColor(Color.rgb(220, 211, 231))
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear1, params)

        val btn = Button(this)
        btn.text = "아기짐승 김정민"
        btn.setBackgroundColor(Color.rgb(240, 219, 225))
        linear1.addView(btn)

        btn.setOnClickListener {
            Toast.makeText(applicationContext, "말랑콩떡 김정민", Toast.LENGTH_LONG).show()
        }

    }
}