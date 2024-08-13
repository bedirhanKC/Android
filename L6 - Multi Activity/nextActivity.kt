package com.bedirhankc.l6_multiactivity

import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bedirhankc.l6_multiactivity.databinding.ActivityMainBinding
import com.bedirhankc.l6_multiactivity.databinding.ActivityNextBinding

class nextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra("name")
        binding.nameText.text = "Hello $name"

        // Countdown timer
        object : CountDownTimer(11000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.countdownText.text =  (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                finish()
            }
        }.start()
    }
}