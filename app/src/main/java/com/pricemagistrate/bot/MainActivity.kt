package com.pricemagistrate.bot

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTeach = findViewById<Button>(R.id.btnTeach)
        val serviceStatus = findViewById<TextView>(R.id.serviceStatus)

        btnTeach.setOnClickListener {
            // Logic to launch overlay or start learning
            checkAccessibilityPermission()
        }
    }

    private fun checkAccessibilityPermission() {
        val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
        startActivity(intent)
    }
}
