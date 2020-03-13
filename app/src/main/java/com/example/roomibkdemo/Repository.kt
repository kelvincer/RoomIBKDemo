package com.example.roomibkdemo

import android.app.Application
import androidx.lifecycle.LiveData

class Repository(val app: Application) {

    var placeDao: PlaceDao

    init {
        val db = AppDatabase.getInstance(app)
        placeDao = db.getPlaceDao()
    }

     suspend fun search(): List<Canal> {
        return placeDao.getPlaces()
    }
}