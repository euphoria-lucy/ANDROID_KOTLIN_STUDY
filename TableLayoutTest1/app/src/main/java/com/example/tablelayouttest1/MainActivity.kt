package com.example.tablelayouttest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

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
        btnPlus.setOnClickListener(btnListener)
        btnMinus.setOnClickListener(btnListener)
        btnMultiply.setOnClickListener(btnListener)
        btnDivide.setOnClickListener(btnListener)

        for (i in 0..btnIds.size - 1 step 1) {
            numButtons.add(findViewById(btnIds[i]))
        }

        for (i in 0..btnIds.size - 1 step 1) {
            numButtons[i].setOnClickListener {
                if (edit_o.isFocused) {
                    num_o = edit_o.text.toString() + numButtons[i].text.toString()
                    edit_o.setText(num_o)
                } else if (edit_t.isFocused) {
                    num_t = edit_t.text.toString() + numButtons[i].text.toString()
                    edit_t.setText(num_t)
                } else {
                    Toast.makeText(applicationContext, "먼저 입력할 곳에 포커스를 주세요", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

    var btnListener = OnClickListener {
        num_o = edit_o.text.toString()
        num_t = edit_t.text.toString()

        when(it.id) {
            R.id.btnPlus -> result = num_o.toInt() + num_t.toInt()
            R.id.btnMinus -> result = num_o.toInt() - num_t.toInt()
            R.id.btnMultiply -> result = num_o.toInt() * num_t.toInt()
            R.id.btnDivide -> result = num_o.toInt() / num_t.toInt()
        }
        textResult.setText(R.string.text_result)
        textResult.append(result.toString())
    }
}