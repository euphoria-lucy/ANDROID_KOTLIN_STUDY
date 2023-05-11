package com.example.viewpropertiestest2

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var t1 :TextView
        var t2 : TextView
        var t3 : TextView

        t1 = findViewById<TextView>(R.id.text1)
        t2 = findViewById<TextView>(R.id.text2)
        t3 = findViewById<TextView>(R.id.text3)

        t1.setText("PARK SUNG-HAN")
        t1.setTextSize(30.0f)
        t1.setTextColor(Color.MAGENTA)

        t2.setTextSize(35.0f)
        t2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC)

        t3.setText("LIM SUNG-JIN")
        t3.setSingleLine()

    }
}