package com.example.dietaapp.RoomDb

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.launch

@InternalCoroutinesApi
class ViewModel (application: Application) : AndroidViewModel(application) {

   // private val readAllData : LiveData<List<Usuarios>>;
   // private val repository: UsuariosRepository;
    init {
       // val userDao = AppDataBase.getDatabase(application).usuarioDao()
       // repository = UsuariosRepository(userDao);
        //readAllData = repository.obtenerUsuarios
    }
//
//    fun insertUsuarios(usuarios: Usuarios){
//        viewModelScope.launch(Dispatchers.IO){
//            repository.insert(usuarios);
//        }
//    }
}