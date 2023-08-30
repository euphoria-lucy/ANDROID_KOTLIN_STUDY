package com.example.contextmenutest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    lateinit var linear : LinearLayout
    lateinit var btn_one : Button
    lateinit var btn_two : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "배경색 바꾸기 (컨텍스트 메뉴)"
        linear = findViewById(R.id.linear)
        btn_one = findViewById(R.id.btn_one)
        btn_two = findViewById(R.id.btn_two)

        registerForContextMenu(btn_one)
        registerForContextMenu(btn_two)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        var mInflater = this.menuInflater
        if (v === btn_one) {
            menu!!.setHeaderTitle("배경색 변경")
            mInflater.inflate(R.menu.menu_one, menu)
        }
        if (v === btn_two) {
            mInflater.inflate(R.menu.menu_two, menu)
        }

    }

}