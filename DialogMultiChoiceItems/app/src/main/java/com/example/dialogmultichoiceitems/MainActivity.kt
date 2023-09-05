package com.example.dialogmultichoiceitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            var baseballArray = arrayOf("김정민", "류현곤", "박성한")
            var checkArray = booleanArrayOf(false, true, false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 야구선수는?")
            dlg.setIcon(R.drawable.baseball)
            dlg.setMultiChoiceItems(baseballArray, checkArray) {
                dialog, index, isChecked ->
                btn.text = baseballArray[index]
            }
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }

    }
}