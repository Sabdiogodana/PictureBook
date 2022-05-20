package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InterestingFactActivity : AppCompatActivity() {
    lateinit var btnBack3:Button
    lateinit var btnFour:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interesting_fact)
        btnBack3 = findViewById(R.id.btnBack3)
        btnBack3.setOnClickListener {
            val intent= Intent(this,ProjectsActivity::class.java)
            startActivity(intent)
        }
        btnFour = findViewById(R.id.btnFour)
        btnFour.setOnClickListener {
            val intent= Intent(this,GratitudeActivity::class.java)
            startActivity(intent)
        }
    }
}