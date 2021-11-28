package com.example.a19630641android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SpalshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)

        getSupportActionBar()?.hide()

        Handler(Looper.getMainLooper()).postDelayed({

            val sp = this.getSharedPreferences("My_SP", MODE_PRIVATE)
            val username = sp.getString("username", "")

            if (username == ""){
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            } else{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }, 2000)

    }
}