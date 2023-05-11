package com.example.simplecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IntegerRes

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText;
    lateinit var edit2 : EditText;
    lateinit var btnAdd : Button;
    lateinit var btnMin : Button;
    lateinit var btnMul : Button;
    lateinit var btnDiv : Button;
    lateinit var btnRem : Button;
    lateinit var textResult : TextView;
    lateinit var num1 : String;
    lateinit var num2 : String;
    var result : Double? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        textResult = findViewById(R.id.text_total)
        btnAdd = findViewById(R.id.btn_plus)
        btnMin = findViewById(R.id.btn_minus)
        btnMul = findViewById(R.id.btn_multiply)
        btnDiv = findViewById(R.id.btn_divide)
        btnRem = findViewById(R.id.btn_remain)

        btnAdd.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (num1 == "" || num2 == "") {
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            result = num1.toDouble() + num2.toDouble()
            textResult.text = "계산 결과 " + result
        }

        btnMin.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (num1 == "" || num2 == "") {
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            result = num1.toDouble() - num2.toDouble()
            textResult.text = "계산 결과 " + result
        }

        btnMul.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (num1 == "" || num2 == "") {
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            result = num1.toDouble() * num2.toDouble()
            textResult.text = "계산 결과 " + result
        }

        btnDiv.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (num1 == "" || num2 == "") {
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (num2.toDouble() == 0.0) {
                Toast.makeText(baseContext, "나눗셈은 0으로 나눌수 없음!!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            result = num1.toDouble() / num2.toDouble()
            textResult.text = "계산 결과 " + result
        }

        btnRem.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (num1 == "" || num2 == "") {
                Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            result = num1.toDouble() % num2.toDouble()
            textResult.text = "계산 결과 " + result
        }


    }
}