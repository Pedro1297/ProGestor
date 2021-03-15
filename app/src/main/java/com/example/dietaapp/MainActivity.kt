package com.example.dietaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id_button  = findViewById<Button>(R.id.id_button);

        id_button.setOnClickListener {
            val intent = Intent()
            startActivity(intent);
        };


    }
}