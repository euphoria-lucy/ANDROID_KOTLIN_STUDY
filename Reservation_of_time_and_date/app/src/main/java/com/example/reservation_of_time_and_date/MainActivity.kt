package com.example.reservation_of_time_and_date

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.Chronometer
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.TimePicker

class MainActivity : AppCompatActivity() {

    lateinit var chrono_one : Chronometer
    lateinit var btnStart : Button
    lateinit var btnDone : Button
    lateinit var rg : RadioGroup
    lateinit var calendar : CalendarView
    lateinit var timePicker : TimePicker
    lateinit var textResult : TextView
    var selectedYear : Int = 0
    var selectedMonth : Int = 0
    var selectedDay : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chrono_one = findViewById(R.id.chrono_one)
        btnStart = findViewById(R.id.btnStart)
        btnDone = findViewById(R.id.btnDone)
        rg = findViewById(R.id.rg)
        calendar = findViewById(R.id.calendar)
        timePicker = findViewById(R.id.timePicker)
        textResult = findViewById(R.id.textResult)

        timePicker.visibility = View.INVISIBLE
        calendar.visibility = View.INVISIBLE

    }
}