package com.example.hackathon2023_7kiwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import com.example.hackathon2023_7kiwi.databinding.ActivityMyPageBinding

class MyPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMyPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mypageLoginbtn.setOnClickListener() {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
    }
}