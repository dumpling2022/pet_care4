package com.example.pet_care4

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Home2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home2)


        val settingsButton: ImageView = findViewById(R.id.settings)

        settingsButton.setOnClickListener() {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
    }
}