package com.example.roomibkdemo

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CanalesAtencion")
data class Canal(

    @ColumnInfo(name = "idRow")
    @PrimaryKey
    var idRow:Int?,

    @ColumnInfo(name = "idLocalizacion")
    var idLocalizacion: String?,

    @ColumnInfo(name = "idCanal")
    var idCanal: String?,

    @ColumnInfo(name = "nombreLocalizacion")
    var nombreLocalizacion: String? = "",

    @ColumnInfo(name = "idTienda")
    var idTienda: String?,

    @ColumnInfo(name = "direccion")
    var direccion: String?,

    @ColumnInfo(name = "direccionFind")
    var direccionFind: String?,

    @ColumnInfo(name = "distrito")
    var distrito: String?,

    @ColumnInfo(name = "distritoFind")
    var distritoFind: String?,

    @ColumnInfo(name = "provincia")
    var provincia: String?,

    @ColumnInfo(name = "departamento")
    var departamento: String?,

    @ColumnInfo(name = "idBranch")
    var idBranch: String?,

    @ColumnInfo(name = "zona")
    var zona:String?,

    @ColumnInfo(name = "horario")
    var horario: String?,

    @ColumnInfo(name = "latitud")
    var latitud:String?,

    @ColumnInfo(name = "longitud")
    var longitud: String?,

    @ColumnInfo(name = "esWallie")
    var esWallie: Int?

)