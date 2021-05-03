package com.example.quickentry

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quickentry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Set button click listeners
        binding.buttonTodoist.setOnClickListener{ buttonLog(binding.buttonTodoist) }
        binding.buttonAsana.setOnClickListener{ buttonLog(binding.buttonAsana) }
    }

    private fun buttonLog(button: android.widget.Button) {
        // Print button input to console log
    }

}