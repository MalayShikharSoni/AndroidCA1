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

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart: I’m running")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume: I’m running")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause: I’m running")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop: I’m running")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "onRestart: I’m running")
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy: I’m running")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }

}