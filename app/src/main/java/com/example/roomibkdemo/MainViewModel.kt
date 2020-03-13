package com.example.roomibkdemo

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import kotlinx.coroutines.*

class MainViewModel(val app: Application) : AndroidViewModel(app) {

    private val repository: Repository = Repository(app)

    lateinit var ld: LiveData<List<Canal>>

    fun getPlaces(): LiveData<List<Canal>> {

        val ld = liveData(Dispatchers.IO) {
            val l = repository.search()
            Log.d("DBCanal", "size: ${l.size}")
            emit(l)
        }

        return ld


        /* viewModelScope().launch() {
             val l = repository.search()
             Log.d("DBCanal", "size: ${l.size}")
         }*/
    }
}