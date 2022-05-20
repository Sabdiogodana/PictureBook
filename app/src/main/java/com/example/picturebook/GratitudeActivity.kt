package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.zip.Adler32

class GratitudeActivity : AppCompatActivity() {
    lateinit var btnBack4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gratitude)
        btnBack4 = findViewById(R.id.btnBack4)
        btnBack4.setOnClickListener {
            val intent= Intent(this,InterestingFactActivity::class.java)
            startActivity(intent)
        }
    }
}