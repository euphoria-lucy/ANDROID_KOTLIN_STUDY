package com.example.codelayout

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity {

    class SecondActivity : AppCompatActivity() {
        lateinit var btn1: Button
        lateinit var btn2: Button
        lateinit var btn3: Button
        lateinit var btn4: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_second)

            btn1 = findViewById(R.id.btn1)
            btn2 = findViewById(R.id.btn2)
            btn3 = findViewById(R.id.btn3)
            btn4 = findViewById(R.id.btn4)

            btn1.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://home.kepco.co.kr/kepco/SP/A/main/volley.do?menuCd=FN1104"))
                startActivity(intent)
            }

            btn2.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ssglanders.com/"))
                startActivity(intent)
            }

            btn3.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/NCTsmtown_DREAM"))
                startActivity(intent)
            }

            btn4.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kgcsports.com/volleyball/main/main.php"))
                startActivity(intent)
            }

        }
    }
}