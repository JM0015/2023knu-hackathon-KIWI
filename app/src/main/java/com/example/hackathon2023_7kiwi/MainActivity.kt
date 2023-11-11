package com.example.hackathon2023_7kiwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hackathon2023_7kiwi.databinding.ActivityMainBinding
import com.example.hackathon2023_7kiwi.databinding.ActivityNoticeBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //startActivity(Intent(this, noticeActivity::class.java))
        startActivity(Intent(this, MyPageActivity::class.java))
        //startActivity(Intent(this, loginActivity::class.java))
    }
}