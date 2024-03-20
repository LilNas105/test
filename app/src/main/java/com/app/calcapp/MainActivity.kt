package com.app.calcapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1 = findViewById<EditText>(R.id.etNumber1).text
        val etNumber2 = findViewById<EditText>(R.id.etNumber2).text

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSub = findViewById<Button>(R.id.btnSubstract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {
            val result = etNumber1.toString().toInt() + etNumber2.toString().toInt()
            tvResult.text = result.toString()
        }

        btnSub.setOnClickListener {
            val result = etNumber1.toString().toInt() - etNumber2.toString().toInt()
            tvResult.text = result.toString()
        }

        btnMultiply.setOnClickListener {
            val result = etNumber1.toString().toInt() * etNumber2.toString().toInt()
            tvResult.text = result.toString()
        }

        btnDivide.setOnClickListener {
            val result = etNumber1.toString().toInt() / etNumber2.toString().toInt()
            tvResult.text = result.toString()
        }
    }
}