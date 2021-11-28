package com.example.a19630641android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnKeluar = findViewById<Button>(R.id.btnKeluar)

        val txtUsername = findViewById<EditText>(R.id.txtUsername)
        val txtPassword = findViewById<EditText>(R.id.txtPassword)

        btnLogin.setOnClickListener {

            val username = "school.taupik678@gmail.com"
            val password = "staupik678"

            val inUsername = txtUsername.text.toString()
            val inPassword = txtPassword.text.toString()

            if (inUsername == username && inPassword == password){

                val sp = this.getSharedPreferences("My_SP", MODE_PRIVATE)
                with(sp.edit()) {
                    putString("password", inPassword)
                    putString("username", inUsername)
                    apply()
                }

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Username/Password salah", Toast.LENGTH_SHORT).show()
            }

        }

        btnKeluar.setOnClickListener {
            finish()
        }

    }
}