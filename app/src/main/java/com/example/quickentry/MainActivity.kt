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
        binding.buttonTodoist.setOnClickListener{ buttonLog(Service.TODOIST) }
        binding.buttonAsana.setOnClickListener{ buttonLog(Service.ASANA) }
    }

    private fun buttonLog(service: Service) {
        // Print button input to console log
        println("${service.prettyName}: ${binding.entryField.text}")
        binding.entryField.text?.clear()
    }

}

enum class Service(val prettyName: String) {
    TODOIST("Todoist"),
    ASANA("Asana"),
    ROAM("Roam")
}
