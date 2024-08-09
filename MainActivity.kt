package com.bedirhankc.l1_kotlinbasics

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Print
        println("Selam ")
        println(4*2)

        // Variables and Constants (Değişkenler ve Sabitler)

        // var: mutable (değişebilir)
        // val: immutable (değişmez)
        val name = "Bedirhan"
        // name = "Ahmet" // Hata verir
        println("Merhaba $name")
        var age = 22
        age = 23
        println("age: $age")

        val result = age*5
        println("result: $result")

        // Data Types (Veri Tipleri)
        val number = 5 // Int
        val number2 = 5.5 // Double
        val number3 = 5.5f // Float
        val char = 'A' // Char
        val string = "Bedirhan" // String
        val boolean = true // Boolean
        val boolean2 = false // Boolean

        // Defining (Tanımlama)
        val number4: Int
        number4 = 10

        // array (Diziler)
        println("array")
        val numbers = arrayOf(1, 2, 3, 4, 5)
        val names = arrayOf("Bedirhan", "Ahmet", "Mehmet")
        val mixed = arrayOf(1, 2, 3, 4, 5, "Bedirhan", "Ahmet", "Mehmet")
        println("numbers: ${numbers[0]}")
        println("names: ${names[0]}")
        println("mixed: ${mixed[0]}")
        println("mixed: ${mixed[7]}")

        // list (Listeler)
        println("list")
        val numbers2 = listOf(1, 2, 3, 4, 5)
        val names2 = listOf("Bedirhan", "Ahmet", "Mehmet")
        val mixed2 = listOf(1, 2, 3, 4, 5, "Bedirhan", "Ahmet", "Mehmet")
        println("numbers2: ${numbers2[0]}")
        println("names2: ${names2[0]}")
        println("mixed2: ${mixed2[0]}")
        println("mixed2: ${mixed2[7]}")

        //  arraylist (Dizi Listeleri)
        println("arraylist")
        val stringArrayList = arrayListOf<String>()
        stringArrayList.add("Bedirhan")
        stringArrayList.add("Ahmet")
        stringArrayList.add("Mehmet")
        println("stringArrayList: ${stringArrayList[0]}")
        val numbers3 = arrayListOf(1, 2, 3, 4, 5)
        val names3 = arrayListOf("Bedirhan", "Ahmet", "Mehmet")
        val mixed3 = arrayListOf(1, 2, 3, 4, 5, "Bedirhan", "Ahmet", "Mehmet")
        println("numbers3: ${numbers3[0]}")
        println("names3: ${names3[0]}")
        println("mixed3: ${mixed3[0]}")
        println("mixed3: ${mixed3[7]}")

        // set (Kümeler)
        println("set")
        val set = setOf(1, 1, 2, 3, 4, 4, 5, 6, 6, 7)
        // set sadece unique değerleri tutar
        println("set: ${set}")
        set.forEach { println(it) }

        // map (Haritalar)
        println("map")
        val map = hashMapOf(1 to "Bedirhan", 2 to "Ahmet", 3 to "Mehmet")
        map.put(4, "Ali")
        println("map: ${map}")
        println("map: ${map[1]}")
        map.forEach { println(it) }
        map.forEach { (key, value) -> println("$key: $value") }

        // if (Eğerler)
        println("if")
        val age2 = 22
        if (age2 >= 18) {
            println("oy kullanabilirsiniz")
        } else if (age2 >= 16) {
            println("ebeveyn ile oy kullanabilirsiniz")
        } else {
            println("oy kullanamazsınız")
        }

        // when (Switch)
        println("when")
        val number5 = 2
        when (number5) {
            1 -> println("Bir")
            2 -> println("İki")
            3 -> println("Üç")
            4 -> println("Dört")
            5 -> println("Beş")
            else -> println("Bilinmiyor")
        }

        // for (Döngüler)
        println("for")
        val numbers4 = arrayOf(1, 2, 3, 4, 5)
        for (number in numbers4) {
            println(number)
        }

        println("for with index")
        for (i in 1..10) {
            println(i)
        }

        // while (While)
        println("while")
        var i = 10
        while (i > 5) {
            println(i)
            i--
        }

        // for each (Her Bir)
        println("for each")
        val numbers5 = arrayOf(1, 2, 3, 4, 5)
        numbers5.forEach { println(it) }


    }

}