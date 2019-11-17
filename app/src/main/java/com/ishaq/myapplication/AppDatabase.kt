package com.ishaq.myapplication

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        var appDb: AppDatabase? = null

        fun getDb(context: Context): AppDatabase {
            if (appDb == null) {
                appDb = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java, "MyDb"
                ).allowMainThreadQueries().build()
            }
            return appDb!!
        }
    }
}