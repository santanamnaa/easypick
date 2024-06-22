package com.example.easypick

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ActivityIntro2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_2)

        val buttonIntro2 = findViewById<ImageButton>(R.id.button_intro_2)
        buttonIntro2.setOnClickListener {
            val intent = Intent(this, ActivityIntro3::class.java)
            startActivity(intent)
        }
    }
}
