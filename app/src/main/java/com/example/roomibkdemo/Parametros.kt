package com.example.roomibkdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Parametros")
data class Parametros(

    @PrimaryKey
    @ColumnInfo(name = "idparametro")
    var idparametro:Int?,

    @ColumnInfo(name = "nombre")
    var nombre: String?,

    @ColumnInfo(name = "valor")
    var valor:  String?

)