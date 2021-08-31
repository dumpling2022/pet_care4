package com.example.pet_care4
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.pet_care4.HomeActivity as HomeActivity


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val calFragment = CalFragment()
        val settingsButton : ImageButton = findViewById(R.id.settings) //프로필 수정이나 지도등

        settingsButton.setOnClickListener(){
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)



        bottomNavigationView.setOnItemSelectedListener{

            val intent2 = Intent(this, HomeActivity::class.java)
            val intent3 = Intent(this, DictActivity::class.java)


            when(it.itemId){
                R.id.bottom_nav_home -> startActivity(intent2)
                R.id.bottom_nav_dic -> startActivity(intent3)
            }


            when(it.itemId){
                R.id.bottom_nav_calender ->  replaceFragment(calFragment)
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
