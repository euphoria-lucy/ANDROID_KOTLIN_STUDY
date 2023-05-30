package com.example.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class Direct5_3_Activity : AppCompatActivity() {

    lateinit var edit : EditText
    lateinit var text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linear1 = LinearLayout(this)
        linear1.orientation = LinearLayout.VERTICAL
        linear1.setBackgroundColor(Color.rgb(220, 211, 231))
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear1, params)

        edit = EditText(this)
        edit.textSize = 20f
        edit.setBackgroundColor(Color.rgb(238, 228, 238))
        linear1.addView(edit)

        var btn = Button(this)
        btn.text = "버튼"
        btn.setBackgroundColor(Color.rgb(244, 221, 226))
        linear1.addView(btn)

        text = TextView(this)
        text.text = "Part of result"
        text.textSize = 20f
        text.setTextColor(Color.BLACK)
        linear1.addView(text)

        btn.setOnClickListener {
            text.text = edit.text
        }

    }
}