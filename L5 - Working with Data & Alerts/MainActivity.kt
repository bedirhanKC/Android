package com.bedirhankc.l_5_workingwithdata

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bedirhankc.l_5_workingwithdata.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // shared preferences
        sharedPreferences = getSharedPreferences("com.bedirhankc.l_5_workingwithdata", MODE_PRIVATE)

        val name = sharedPreferences.getString("name", "")
        binding.textView.text = "Name: $name"

        // 1- toast 2- alert dialog 3- snackbar
        // context, text, duration
        // activity context -> this
        // application context -> applicationContext

        Toast.makeText(this, "Hello World!", Toast.LENGTH_LONG).show()

    }

    fun save(view: View) {

        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("Yes") { dialog, which ->
            val name = binding.editTextText.text.toString()
            binding.textView.text = "Name: $name"
            sharedPreferences.edit().putString("name", name).apply() // .commit()
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
        }
        alert.setNegativeButton("No") { dialog, which ->
            Toast.makeText(this, "Not Saved", Toast.LENGTH_SHORT).show()
        }
        alert.show()

    }
    fun delete(view: View) {
        if(sharedPreferences.getString("name", "") != "") {
            sharedPreferences.edit().remove("name").apply()
            binding.textView.text = "Name: "
            //snackbar
            Snackbar.make(view, "Deleted", Snackbar.LENGTH_SHORT).show()
        } else {
            Snackbar.make(view, "There is no data to delete", Snackbar.LENGTH_SHORT).show()
        }
    }

}