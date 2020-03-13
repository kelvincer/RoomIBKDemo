package com.example.roomibkdemo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(version = 2, entities = [Canal::class])
abstract class AppDatabase : RoomDatabase() {

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null
        val DATABASE_NAME = "ibkdbbm"
        val DATABASE_DIR = "databases/ibkdbbm.db"

        fun getInstance(context: Context): AppDatabase {
            return Room
                .databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .createFromAsset(DATABASE_DIR)
                .build()
        }

        val migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE 'CanalesAtencion' ADD COLUMN 'age' INTEGER NOT NULL");
            }
        }
    }

    abstract fun getPlaceDao(): PlaceDao
}