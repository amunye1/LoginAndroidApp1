package com.tc.basicandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btn_login = findViewById<Button>(R.id.login)

//        btn_login.setOnClickListener {
//            //This is basically switch screen the this keyword is pointing
//            //to the current class and then the second parameter
//            //points to the next class/ screen we want to go to
//
////            startActivity(Intent(this@MainActivity, Dashboard::class.java))
//
//        }


    }

}