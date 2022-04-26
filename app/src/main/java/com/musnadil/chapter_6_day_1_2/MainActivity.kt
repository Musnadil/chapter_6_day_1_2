package com.musnadil.chapter_6_day_1_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.musnadil.chapter_6_day_1_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnHandler.setOnClickListener {
                startActivity(Intent(this@MainActivity,HandlerActivity::class.java))
            }
            btnAsynctask.setOnClickListener {
                startActivity(Intent(this@MainActivity,AsynctaskActivity::class.java))
            }
            btnCoroutines.setOnClickListener {
                startActivity(Intent(this@MainActivity,CoroutinesActivity::class.java))
            }
        }
    }
}