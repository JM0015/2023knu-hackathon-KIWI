package com.example.hackathon2023_7kiwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hackathon2023_7kiwi.databinding.ActivityLoginBinding

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signinBtn.setOnClickListener() {
            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)
        }
    }
}
