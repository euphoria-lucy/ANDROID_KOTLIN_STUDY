package com.example.vote_10_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "사진 선호도 투표"


        var voteCount = IntArray(9) // int[] voteCount = new int[9]와 같음
        for (i in 0 .. 8)
            voteCount[i] = 0

        var imgV = arrayOfNulls<ImageView>(9);

        var imgvID = arrayOf(R.id.iv_one, R.id.iv_two, R.id.iv_thr,
                             R.id.iv_four, R.id.iv_five, R.id.iv_six,
                             R.id.iv_seven, R.id.iv_eight, R.id.iv_nine)

        var imgName = arrayOf("하트덕구", "종이비행기덕구", "우산덕구",
                              "우비덕구", "야구덕구", "볼하트덕구",
                              "별덕구", "루돌프덕구", "네잎클로버덕구")

        for (i in imgvID.indices) {
            imgV[i] = findViewById(imgvID[i])
            imgV[i]!!.setOnClickListener {
                voteCount[i]++
                Toast.makeText(applicationContext, imgName[i] + " : " + voteCount[i] + " 표", Toast.LENGTH_SHORT).show()
            }
        }

        var btnResult = findViewById<Button>(R.id.btnResult)
        btnResult.setOnClickListener {
            var intent = Intent(applicationContext, ResultActivity::class.java)
            intent.putExtra("voteCount", voteCount)
            intent.putExtra("imgName", imgName)
            startActivity(intent)
        }

    }
}