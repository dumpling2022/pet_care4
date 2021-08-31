package com.example.pet_care4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.naver.maps.map.MapFragment

class Settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)


        val buttonMap: ConstraintLayout = findViewById(R.id.Map)

        buttonMap.setOnClickListener() {
            val intent = Intent(this, MapFragment::class.java)
            startActivity(intent)
        }

    }
}