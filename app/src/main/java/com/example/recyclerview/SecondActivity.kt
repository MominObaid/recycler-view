package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemName = binding.itemResultText1
        val itemMessage = binding.itemResultText2

        val name = intent.getStringExtra("name")
        val message = intent.getStringExtra("message")
        itemName.text = name
        itemMessage.text = message
    }
}