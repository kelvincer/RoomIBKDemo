package com.example.roomibkdemo

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface PlaceDao {

     @Query("SELECT * FROM CanalesAtencion")
     fun getPlaces(): List<Canal>
}