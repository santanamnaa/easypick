package com.example.easypick

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ForgetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forget_pass1)

        val emailEditText: EditText = findViewById(R.id.etEmail)
        val submitButton: Button = findViewById(R.id.btnSubmit)

        submitButton.setOnClickListener {
            val email = emailEditText.text.toString()
            // Handle password reset logic here, e.g., send reset email

            // Navigate to success screen or show success message
            // val intent = Intent(this, SuccessActivity::class.java)
            // startActivity(intent)
        }
    }
}
