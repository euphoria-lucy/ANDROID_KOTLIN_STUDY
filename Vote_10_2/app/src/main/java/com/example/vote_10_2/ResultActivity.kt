package com.example.vote_10_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        title = "투표 결과"

        // ResultActivity를 시작시킨 intent 객체에서 투표수가 저장된 배열객체 참조값, 이미지 이름이 저장된 배열객체 참조값을 반환
        var intent = intent
        var voteCount = intent.getIntArrayExtra("voteCount")
        var imgName = intent.getStringArrayExtra("imgName")

        // 이미지 이름이 나타날 TextView 객체 참조값을 저장할 1차원 배열
        var tv = arrayOfNulls<TextView>(imgName!!.size)

        // 투표수가 나타날 RatingBar 객체의 참조값을 저장할 1차원 배열
        var rBar = arrayOfNulls<RatingBar>(imgName!!.size)

        // TextView 객체의 ID값 저장할 1차원 배열
        var tvID = arrayOf(R.id.tv_one, R.id.tv_two, R.id.tv_thr,
                           R.id.tv_four, R.id.tv_five, R.id.tv_six,
                           R.id.tv_seven, R.id.tv_eight, R.id.tv_nine)

        // RatingBar 객체의 ID값 저장할 1차원 배열
        var rBarID = arrayOf(R.id.rbar_one, R.id.rbar_two, R.id.rbar_thr,
                          R.id.rbar_four, R.id.rbar_five, R.id.rbar_six,
                          R.id.rbar_seven, R.id.rbar_eight, R.id.rbar_nine)

        for (i in imgName.indices) {
            tv[i] = findViewById<TextView>(tvID[i])
            tv[i]!!.setText(imgName[i])
            rBar[i] = findViewById<RatingBar>(rBarID[i])
            rBar[i]!!.rating = voteCount!![i].toFloat()
        }

        var btnReturn = findViewById<Button>(R.id.btnReturn)
        btnReturn.setOnClickListener {
            finish()
        }

    }
}