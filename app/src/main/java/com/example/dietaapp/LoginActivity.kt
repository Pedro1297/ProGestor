package com.example.dietaapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.navOptions


class LoginActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val id_iniciarSesion = findViewById<Button>(R.id.id_iniciar_sesion_usuario);
        val id_crearCuenta = findViewById<Button>(R.id.id_registrarme);


        id_iniciarSesion.setOnClickListener {
            val intent = Intent(this, AgregarPesoActivity::class.java);
            startActivity(intent);
        }
        id_crearCuenta.setOnClickListener({
            crearCuenta();
        });

    }


    fun iniciarSesion(){

    }

    fun crearCuenta(){
        val intent = Intent(this, RegistrarUsuarios::class.java);
        startActivity(intent);
    }
}