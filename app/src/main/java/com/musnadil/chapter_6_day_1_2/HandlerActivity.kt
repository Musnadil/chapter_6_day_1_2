package com.musnadil.chapter_6_day_1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.musnadil.chapter_6_day_1_2.databinding.ActivityHandlerBinding

class HandlerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHandlerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHandlerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val handler = object : Handler(Looper.getMainLooper()){
            override fun handleMessage(msg: Message) {
                val message = msg.obj as String
                binding.tvText.text = message
            }
        }
        binding.btnClick.setOnClickListener {
            runOnUiThread {
                val text = "Musnadil"
                val msg = Message.obtain()
                msg.obj = text
                msg.target = handler
                msg.sendToTarget()
            }
        }
    }
}