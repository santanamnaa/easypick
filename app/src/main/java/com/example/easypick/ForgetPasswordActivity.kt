package com.example.yourapp

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.easypick.R

class ForgetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forget_pass1)

        val etEmail: EditText = findViewById(R.id.etEmail)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        val tvSignIn: TextView = findViewById(R.id.tvSignIn)

        tvSignIn.setOnClickListener {
            // Handle sign in click
            startActivity(intent)
        }

        etEmail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                btnSubmit.isEnabled = !s.isNullOrEmpty()
                if (btnSubmit.isEnabled) {
                    btnSubmit.setBackgroundResource(R.drawable.button_background_enabled)
                } else {
                    btnSubmit.setBackgroundResource(R.drawable.button_background_disabled)
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }
}
