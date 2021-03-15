package com.example.dietaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class PesoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peso)


       val id_agregar = findViewById<Button>(R.id.id_button_agregar);

        id_agregar.setOnClickListener{
            val intent = Intent(this, RegistrarPesoActivity::class.java);
            startActivity(intent);
        }
    }
}