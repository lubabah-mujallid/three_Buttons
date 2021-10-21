package com.example.three_buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.three_buttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun b1(view: View) {
        var text = binding.et1.text.toString()
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    fun b2(view: View) {
        binding.tvMain.text = binding.et2.text.toString()
    }

    fun b3(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("text", binding.et3.text.toString())
        startActivity(intent)
    }
}

//add intent extra
//add view binding

/*Create 3 Buttons, 3 Edit Texts, and one Text View

The first Edit Text and Button should display in a Toast message

The second should update the Text View

The third should update a Text View in a new activity*/