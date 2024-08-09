package com.bedirhankc.l2_classesandfunctions

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        textView.text = "Result :"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val result = add(5, 3)
        println("Result: $result")

        //Classes and Functions
        val person = Person("Bedirhan", 25, "Male")
        person.setJob("Developer")

        //Nullability

        var myString : String? = null
        myString = "test"
        println(myString)

        var myAge : Int? = null
        //myAge = 50
        // !! ?

        //1) !!
        //println(myAge!! * 10)

        //2) safe call

        println(myAge?.minus(10))

        //3)

        if(myAge != null) {
            println(myAge.minus(10))
        } else {
            println("myAge is null")
        }


        //4) elvis operator

        println(myAge?.minus(10) ?: -10)

        //5)
        myAge?.let {
            println(it * 10)
        }


    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun buttonClick( view: android.view.View) {
        val result = add(5, 3)
        textView.text = "Result : $result"
    }


}