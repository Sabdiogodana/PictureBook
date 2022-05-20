package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProjectsActivity : AppCompatActivity() {
    lateinit var btnBack:Button
    lateinit var btnThree:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)
        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent=Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }
        btnThree = findViewById(R.id.btnThree)
        btnThree.setOnClickListener {
            val intent=Intent(this,InterestingFactActivity::class.java)
            startActivity(intent)
        }
    }
}