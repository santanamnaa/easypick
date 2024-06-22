package com.example.easypick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.easypick.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnsignup : TextView = binding.signup
        btnsignup.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)

        }


        val btnlogin : Button = binding.LoginBTN
        btnlogin.setOnClickListener {
            val intent = Intent(this,FragmentActivity::class.java)
            startActivity(intent)
        }

    }
}