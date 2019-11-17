package com.ishaq.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = AppDatabase.getDb(applicationContext)
        db.userDao().insertAll(User(0,"Ishaq","Hassan"))
    }
}
