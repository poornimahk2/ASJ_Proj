package com.example.asj_project_main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asj_project_main.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val healthId = intent.getIntExtra(HEALTH_EXTRA,-1)
        val health = healthById(healthId)
        if(health!=null){
            binding.cover.setImageResource(health.cover)
            binding.scrollInfo.text = health.info
        }
    }

    private fun healthById(healthId:Int): healthcare? {
        for(health in healthcareList){
            if (health.id == healthId)
                return health
        }
        return null

    }
}