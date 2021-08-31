package com.example.pet_care4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)


        val buttonMap: ConstraintLayout = findViewById(R.id.Map)
        val setProfile: ConstraintLayout = findViewById(R.id.setProfile)

        buttonMap.setOnClickListener() {
            val intent = Intent(this, NaverMapActivity::class.java)
            startActivity(intent)
        }

        setProfile.setOnClickListener(){
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

    }
}