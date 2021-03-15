package com.example.dietaapp.RoomDb

import androidx.lifecycle.LiveData


class UsuariosRepository(private val usuariosDao: UsuariosDao) {

    //val obtenerUsuarios: LiveData<List<Usuarios>> = usuariosDao.getAll();

    suspend fun insert(usuario: Usuarios){
        usuariosDao.insertUsuario(usuario);
    }

}