package com.example.dietaapp.RoomDb

import androidx.room.*
import com.example.dietaapp.RegistrarUsuarios

@Dao
interface UsuariosDao {

    @Query("select*from Usuarios")
     fun getAll():List<RegistrarUsuarios>;

    @Insert
    fun insertUsuario(registrarUsuarios: Usuarios);

}