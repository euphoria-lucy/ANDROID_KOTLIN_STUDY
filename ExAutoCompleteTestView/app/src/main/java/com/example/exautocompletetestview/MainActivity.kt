package com.example.exautocompletetestview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var items = arrayOf("CSI - 뉴욕", "CSI - 라스베거스", "CSI - 마이애미", "Friends", "Fringe", "Lost", "Lost World")

    }
}