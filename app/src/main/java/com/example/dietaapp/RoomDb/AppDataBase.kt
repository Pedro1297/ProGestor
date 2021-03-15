package com.example.dietaapp.RoomDb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = arrayOf(Usuarios::class), version = 1, exportSchema = false)
public abstract class AppDataBase : RoomDatabase() {

    abstract fun usuarioDao(): UsuariosDao

//    companion object{
//        @Volatile
//        private var INSTANCE : AppDataBase? = null;
//
//
//        fun getDatabase(context: Context) : AppDataBase {
//            val tempInstance = INSTANCE;
//            if(tempInstance != null) {
//                return tempInstance;
//            }
//
//            synchronized(this)
//            {
//                val instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        AppDataBase::class.java,
//                        "UsuariosDB"
//                ).build();
//
//                INSTANCE = instance;
//
//                return instance;
//            }
//        }
//    }
}