package com.example.ca1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.ca1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("TAG", "onCreate:I m running")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        val btn =  findViewById<Button>( R.id.btn)

        btn.setOnClickListener {
            Toast.makeText(this, "Log Out Successful!", Toast.LENGTH_SHORT).show()
        }
    }

    

}