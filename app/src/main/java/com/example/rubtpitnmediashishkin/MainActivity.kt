package com.example.rubtpitnmediashishkin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.widget.Toast
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)


        button.setOnClickListener {
            Toast.makeText(this, "Мы учимся в БТПИТ!", Toast.LENGTH_SHORT).show()
        }
    }
}