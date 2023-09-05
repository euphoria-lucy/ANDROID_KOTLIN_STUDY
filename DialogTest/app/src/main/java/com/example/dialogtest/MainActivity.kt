package com.example.dialogtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var btnItem : Button
    lateinit var textResult : TextView
    lateinit var imgv : ImageView
    var verrionArray = arrayOf("김정민", "류현곤", "박성한")
    var baseballImgRes = arrayOf(R.drawable.img_one, R.drawable.img_two, R.drawable.img_thr)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnItem = findViewById(R.id.btn_item)
        textResult = findViewById(R.id.text_result)
        imgv = findViewById<ImageView>(R.id.imgv)

        btnItem.setOnClickListener {
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 야구선수는?")
            dlg.setIcon(R.drawable.baseball)
            dlg.setItems(verrionArray) { dialog, index ->
                textResult.text = verrionArray[index]
                imgv.setImageResource(baseballImgRes[index])
            }
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }
    }
}