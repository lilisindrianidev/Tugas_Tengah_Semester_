package com.tugastengahsemester.lilisindriani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.content.Intent
class MainActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button2)
        button.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))}
        button = findViewById(R.id.button3)
        button.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))}
        button = findViewById(R.id.button4)
        button.setOnClickListener{
            startActivity(Intent(this, MainActivity3::class.java))}
        }
    }


