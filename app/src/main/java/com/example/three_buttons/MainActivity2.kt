package com.example.three_buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.three_buttons.databinding.ActivityMain2Binding
import com.example.three_buttons.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSide.text = intent.extras?.getString("text")
    }
}