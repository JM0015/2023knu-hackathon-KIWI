package com.example.hackathon2023_7kiwi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.widget.Button

class writingBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writing_board)

        val close_button: Button = findViewById()

        close_button.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}