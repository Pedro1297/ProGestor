package com.example.dietaapp.RoomDb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.lang.reflect.AccessibleObject
import java.lang.reflect.Constructor

@Entity(tableName = "Usuarios")
data class Usuarios(
        @PrimaryKey(autoGenerate = true)
        val uid: Int,
        @ColumnInfo(name = "nombre")
        val nombre: String,
        @ColumnInfo(name = "apellido")
        val apellido:String,
        @ColumnInfo(name = "correo")
        val correo:String,
        @ColumnInfo(name = "contrasena")
        val contrasena:String
){}