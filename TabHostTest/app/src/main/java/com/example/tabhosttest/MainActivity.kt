package com.example.tabhosttest

import android.app.TabActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@Suppress("deprecation")
class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var tabSpec_one = tabHost.newTabSpec("spec1").setIndicator("김정민")
        tabSpec_one.setContent(R.id.linear_one)
        tabHost.addTab(tabSpec_one)

        var tabSpec_two = tabHost.newTabSpec("spec2").setIndicator("박성한")
        tabSpec_two.setContent(R.id.linear_two)
        tabHost.addTab(tabSpec_two)

        var tabSpec_three = tabHost.newTabSpec("spec3").setIndicator("이민준")
        tabSpec_three.setContent(R.id.linear_three)
        tabHost.addTab(tabSpec_three)

        tabHost.currentTab = 1

    }
}