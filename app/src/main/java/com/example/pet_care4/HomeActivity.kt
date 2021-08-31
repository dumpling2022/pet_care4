package com.example.pet_care4
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeFragment = HomeFragment()
        val calFragment = CalFragment()
        val dictFragment = DictFragment()
        val settingsButton : ImageButton = findViewById(R.id.settings)

        settingsButton.setOnClickListener(){
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        replaceFragment(homeFragment)

        bottomNavigationView.setOnItemSelectedListener{

            when(it.itemId){
                R.id.bottom_nav_home -> replaceFragment(homeFragment)
                R.id.bottom_nav_calender ->  replaceFragment(calFragment)
                R.id.bottom_nav_dic -> replaceFragment(dictFragment)
            }
            true
        }

    }
    private fun replaceFragment(fragment:Fragment) {
        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.fragment_container, fragment)
                commit()

            }
    }






}
