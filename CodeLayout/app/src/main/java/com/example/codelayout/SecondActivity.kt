package com.example.codelayout

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    lateinit var btn_one : Button
    lateinit var btn_two : Button
    lateinit var btn_thr : Button
    lateinit var btn_four : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn_one = findViewById(R.id.btn_one)
        btn_two = findViewById(R.id.btn_two)
        btn_thr = findViewById(R.id.btn_thr)
        btn_four = findViewById(R.id.btn_four)

        btn_one.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"))
            startActivity(intent)
        }
        btn_two.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-2004-0307"))
            startActivity(intent)
        }
        btn_thr.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ssglanders.com/main"))
            startActivity(intent)
        }
        btn_four.setOnClickListener {
            finish()
        }
    }

}