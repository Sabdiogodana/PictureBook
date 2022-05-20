package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SkillsActivity : AppCompatActivity() {
    lateinit var btnPrevious:Button
    lateinit var btnSecond:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnSecond = findViewById(R.id.btnSecond)
        btnSecond.setOnClickListener {
            val intent= Intent(this,ProjectsActivity::class.java)
            startActivity(intent)
        }

    }
}