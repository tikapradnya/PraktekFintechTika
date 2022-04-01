package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnhome=findViewById<Button>(R.id.btn_home)
        val btnprofile=findViewById<Button>(R.id.btn_profile)
        val btnsettings=findViewById<Button>(R.id.btn_settings)

        btnhome.setOnClickListener {
            LoadFragment(HomeFragment())
        }
        btnprofile.setOnClickListener {
            LoadFragment(ProfileFragment())
        }
        btnsettings.setOnClickListener {
            LoadFragment(SettingsFragment())}
    }
    private fun LoadFragment(fragment:Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).commitNow()

    }
}