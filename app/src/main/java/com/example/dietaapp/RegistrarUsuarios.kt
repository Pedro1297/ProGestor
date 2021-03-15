package com.example.dietaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.dietaapp.RoomDb.AppDataBase
import com.example.dietaapp.RoomDb.Usuarios
import com.example.dietaapp.RoomDb.ViewModel
import kotlinx.coroutines.InternalCoroutinesApi

class RegistrarUsuarios : AppCompatActivity(){

    @InternalCoroutinesApi
    private lateinit var mUsuarioModel: ViewModel;
    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_usuarios)

        mUsuarioModel = ViewModelProvider(this).get(ViewModel::class.java)


        var id:Int = 0;
        val id_nombre = findViewById<EditText>(R.id.id_nombre);
        val id_apellido = findViewById<EditText>(R.id.id_apellido);
        val id_correo = findViewById<EditText>(R.id.id_correo_electronico);
        val id_contrasena = findViewById<EditText>(R.id.id_contrasena);
        val id_registrar = findViewById<Button>(R.id.id_crear_cuenta);
        val id_iniciar_sesion = findViewById<Button>(R.id.id_iniciar_sesion);


        id_registrar.setOnClickListener {

            if(validation(id_nombre.text.toString(), id_apellido.text.toString(), id_correo.text.toString(), id_contrasena.text.toString())){

                val usuarios = Usuarios(0, id_nombre.text.toString(), id_apellido.text.toString(), id_correo.text.toString(), id_contrasena.text.toString());
                //mUsuarioModel.insertUsuarios(usuarios);
                Toast.makeText(this,"Agregado con exito!", Toast.LENGTH_SHORT ).show();
            }
        }
    }

    private fun validation(nombre:String, apellido:String, correo:String, contrasena:String) : Boolean{
        return !(TextUtils.isEmpty(nombre) && TextUtils.isEmpty(apellido) && TextUtils.isEmpty(correo) && TextUtils.isEmpty(contrasena));
    }

    fun login(){
        val intent = Intent(this, MainActivity::class.java);
        startActivity(intent);
    }
}

//            val db = Room.databaseBuilder(
//                    applicationContext,
//                    AppDataBase::class.java, "UsuariosDB"
//            ).build();
//
//            val user: Usuarios = Usuarios(id,  id_nombre.text.toString(), id_apellido.text.toString(), id_correo.text.toString(), id_contrasena.text.toString());
//            db.usuarioDao().insertUsuario(user);
//
//            Toast.makeText(this,"Se ha insertado: "+ user,Toast.LENGTH_LONG).show();