package com.example.dietaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class AgregarPesoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_peso)


        val id_contin = findViewById<Button>(R.id.id_continuar);


        id_contin.setOnClickListener({
            val intent = Intent(this, PesoActivity::class.java);
            startActivity(intent);
        })
    }
}