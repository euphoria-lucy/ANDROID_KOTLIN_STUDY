package com.example.tablelayouttest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edit_o : EditText
    lateinit var edit_t : EditText
    lateinit var btnPlus : Button
    lateinit var btnMinus : Button
    lateinit var btnMultiply : Button
    lateinit var btnDivide : Button
    lateinit var textResult : TextView
    lateinit var num_o : String
    lateinit var num_t : String
    internal var result : Int? = null
    internal var numButtons = ArrayList<Button>(10)
    internal var btnIds = arrayOf(R.id.btn_zero, R.id.btn_one, R.id.btn_two, R.id.btn_thr, R.id.btn_four,
        R.id.btn_five, R.id.btn_six, R.id.btn_seven, R.id.btn_eight, R.id.btn_nine)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.ex5_2)
        edit_o = findViewById(R.id.edit_o)
        edit_t = findViewById(R.id.edit_t)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        textResult = findViewById(R.id.textResult)

    }
}