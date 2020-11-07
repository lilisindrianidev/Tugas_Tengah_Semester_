package com.tugastengahsemester.lilisindriani

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var RadioGroup: RadioGroup


    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button = findViewById(R.id.button2)
        button.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))}
        button = findViewById(R.id.button3)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))}
        button = findViewById(R.id.button4)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))}



    }



}


