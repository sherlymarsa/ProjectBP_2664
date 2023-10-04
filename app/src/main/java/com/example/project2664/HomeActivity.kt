package com.example.project2664

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //    instance
        val btnBook: Button = findViewById(R.id.menu1)

        //        event saat button Fairy diklik
        val intentBookKidActivity = Intent(this,BookKidActivity::class.java)
        startActivity(intentBookKidActivity)
    }
}