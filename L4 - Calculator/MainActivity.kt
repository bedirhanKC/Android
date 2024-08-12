package com.bedirhankc.l4_calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bedirhankc.l4_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun sum(view: android.view.View) {
        val firstNumber = binding.number1.text.toString().toDoubleOrNull()
        val secondNumber = binding.number2.text.toString().toDoubleOrNull()

        if (firstNumber != null && secondNumber != null) {
            val result = firstNumber + secondNumber
            binding.textView3.text = "Result: $result"
        }
        else
            binding.textView3.text = "Result: wrong input"
    }

    fun subtract(view: android.view.View) {
        val firstNumber = binding.number1.text.toString().toDoubleOrNull()
        val secondNumber = binding.number2.text.toString().toDoubleOrNull()

        if (firstNumber != null && secondNumber != null) {
            val result = firstNumber - secondNumber
            binding.textView3.text = "Result: $result"
        }
        else
            binding.textView3.text = "Result: wrong input"
    }

    fun multiply(view: android.view.View) {
        val firstNumber = binding.number1.text.toString().toDoubleOrNull()
        val secondNumber = binding.number2.text.toString().toDoubleOrNull()

        if (firstNumber != null && secondNumber != null) {
            val result = firstNumber * secondNumber
            binding.textView3.text = "Result: $result"
        }
        else
            binding.textView3.text = "Result: wrong input"
    }

    fun divide(view: android.view.View) {
        val firstNumber = binding.number1.text.toString().toDoubleOrNull()
        val secondNumber = binding.number2.text.toString().toDoubleOrNull()

        if (firstNumber != null && secondNumber != null) {
            val result = firstNumber / secondNumber
            binding.textView3.text = "Result: $result"
        }
        else
            binding.textView3.text = "Result: wrong input"
    }
}