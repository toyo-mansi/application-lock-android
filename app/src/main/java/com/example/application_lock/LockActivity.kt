package com.example.application_lock

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity // For mindSdk: 23

class LockActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lock)

        val etPin: EditText = findViewById(R.id.etPin)
        val btnUnlock: Button = findViewById(R.id.btnUnlock)
        val tvStatus: TextView = findViewById(R.id.tvStatus)


        btnUnlock.setOnClickListener {
            val input = etPin.text?.toString().orEmpty()
            if (input.isBlank()) {
                tvStatus.text = "PIN required"
                return@setOnClickListener
            }

            val isCorrect = input == "123456"

            if (isCorrect) {
                tvStatus.text = "Unlocked"
            } else {
                tvStatus.text = "Incorrect Pin"
            }
        }
    }
}