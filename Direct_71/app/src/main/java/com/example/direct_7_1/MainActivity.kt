package com.example.direct_7_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    lateinit var edit : EditText
    lateinit var img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "배경색과 버튼 변경"
        edit = findViewById(R.id.edit_Text)
        img = findViewById(R.id.image_View)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.imgRotate -> {
                img.rotation = edit.text.toString().toFloat()
                item.isChecked = true
                return true
            }

            R.id.item_one -> {
                img.setImageResource(R.drawable.item_one)
                item.isChecked = true
                return true
            }

            R.id.item_two -> {
                img.setImageResource(R.drawable.item_two)
                item.isChecked = true
                return true
            }

            R.id.item_thr -> {
                img.setImageResource(R.drawable.item_thr)
                item.isChecked = true
                return true
            }
        }

        return false

    }

}