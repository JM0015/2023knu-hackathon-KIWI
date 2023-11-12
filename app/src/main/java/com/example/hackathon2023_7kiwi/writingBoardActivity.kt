package com.example.hackathon2023_7kiwi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.widget.Button
import com.example.hackathon2023_7kiwi.databinding.ActivityWritingBoardBinding

class writingBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityWritingBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.closeButton.setOnClickListener() {
            val intent = Intent(this, BoardFragment::class.java)
            startActivity(intent)
        }
    }
}