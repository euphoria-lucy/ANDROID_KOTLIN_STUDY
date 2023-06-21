package com.example.codelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn_one : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_one = findViewById<Button>(R.id.btn_one)

        btn_one.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 눌렀어요!", Toast.LENGTH_SHORT).show()
        }
    }
}