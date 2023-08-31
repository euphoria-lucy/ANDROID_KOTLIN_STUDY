package com.example.contextmenutest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
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

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return super.onContextItemSelected(item)
        when(item.itemId) {
            R.id.itemPink -> {
                linear.setBackgroundColor(Color.parseColor("#F4DDE2"))
                return true;
            }

            R.id.itemSkyBlue -> {
                linear.setBackgroundColor(Color.parseColor("#DADFEC"))
                return true;
            }

            R.id.itemPurple -> {
                linear.setBackgroundColor(Color.parseColor("#DED8EB"))
                return true;
            }

            R.id.subRotate -> {
                btn_one.rotation = 180f
                return true
            }

            R.id.subSize -> {
                btn_one.scaleX = 2f
                return true
            }

            R.id.subOriginal -> {
                btn_one.rotation = 0f
                btn_one.scaleX = 1f
                return true
            }
        }
        return false
    }

}