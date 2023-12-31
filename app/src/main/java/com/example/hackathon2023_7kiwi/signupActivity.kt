package com.example.hackathon2023_7kiwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hackathon2023_7kiwi.databinding.ActivitySignupBinding

class signupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInBackBtn.setOnClickListener() {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }

    }
}