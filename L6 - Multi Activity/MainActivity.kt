package com.bedirhankc.l6_multiactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bedirhankc.l6_multiactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onStart() {
        super.onStart()
        binding.editText.text.clear()
    }

    fun send(view: android.view.View) {
        if (binding.editText.text.isNotEmpty()) {
            val intent = Intent(this, nextActivity::class.java)
            intent.putExtra("name", binding.editText.text.toString())
            startActivity(intent)
        }
        else {
            binding.editText.error = "Please enter a name"
        }
    }
}