package com.example.reservation_of_time_and_date

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.Chronometer
import android.widget.DatePicker
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.TimePicker

class MainActivity : AppCompatActivity() {

    lateinit var chrono_one : Chronometer
    lateinit var rg : RadioGroup
    lateinit var radioCal : RadioButton
    lateinit var radioTime : RadioButton
    lateinit var calendar : DatePicker
    lateinit var timePicker : TimePicker
    lateinit var textResult : TextView
    var selectedYear : Int = 0
    var selectedMonth : Int = 0
    var selectedDay : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chrono_one = findViewById(R.id.chrono_one)
        rg = findViewById(R.id.rg)
        radioCal = findViewById(R.id.radioDate)
        radioTime = findViewById(R.id.radioTime)
        calendar = findViewById(R.id.calendar)
        timePicker = findViewById(R.id.timePicker)
        textResult = findViewById(R.id.textResult)

        rg.visibility = View.INVISIBLE
        timePicker.visibility = View.INVISIBLE
        calendar.visibility = View.INVISIBLE

        radioCal.setOnClickListener {
            timePicker.visibility = View.INVISIBLE
            calendar.visibility = View.VISIBLE
        }

        radioTime.setOnClickListener {
            timePicker.visibility = View.VISIBLE
            calendar.visibility = View.INVISIBLE
        }

        chrono_one.setOnClickListener {
            rg.visibility = View.VISIBLE
            chrono_one.base = SystemClock.elapsedRealtime()
            chrono_one.start()
            chrono_one.setTextColor(Color.GRAY)
        }

        textResult.setOnLongClickListener {
            chrono_one.stop()
            chrono_one.setTextColor(Color.CYAN)
            textResult.setText("" + selectedYear + "년 " + selectedMonth + "월 " + selectedDay + "일")
            textResult.append("" + timePicker.currentHour + "시 " + timePicker.currentMinute + "분 ")
            textResult.append("예약됨")
            true
        }

        calendar.setOnDateChangedListener { datePicker, year, month, day ->
            selectedYear = year
            selectedMonth = month + 1
            selectedDay = day
        }

    }
}