package com.example.asj_project_main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asj_project_main.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.modernTech.setOnClickListener {
            //add something
        }
        binding.healthCare.setOnClickListener {
            val intent = Intent(this, HealthMenuActivity::class.java)
            startActivity(intent)
        }
        binding.dailyReminder.setOnClickListener {
            //add something
        }
        binding.newsCard.setOnClickListener {
            //add something
        }
        binding.fitness.setOnClickListener {
            //add something
        }
        binding.selfCare.setOnClickListener {
            //add something
        }
        binding.entertainmentCard.setOnClickListener {
            //add something
        }
        binding.covidPrec.setOnClickListener {
            //add something
        }
        binding.userManual.setOnClickListener {
            //add something
        }
        binding.aboutUs.setOnClickListener {
            //add something
        }
    }
}