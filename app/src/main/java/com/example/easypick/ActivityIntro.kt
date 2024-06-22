package com.example.easypick

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ActivityIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val buttonIntro = findViewById<ImageButton>(R.id.button_intro)
        buttonIntro.setOnClickListener {
            val intent = Intent(this, ActivityIntro2::class.java)
            startActivity(intent)
        }
    }
}
