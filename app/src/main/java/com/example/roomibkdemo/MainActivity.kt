package com.example.roomibkdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        try {
            viewModel.getPlaces().observe(this, Observer {
                Log.d("DBCanal", "db")
            })
        }catch (e: Exception){
            e.printStackTrace()
        }
    }
}
