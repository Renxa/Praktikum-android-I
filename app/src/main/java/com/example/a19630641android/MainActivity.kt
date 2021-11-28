package com.example.a19630641android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSimpan = findViewById<Button>(R.id.btnSimpan)
        val btnBatal = findViewById<Button>(R.id.btnBatal)

        val txtNama = findViewById<EditText>(R.id.txtNama)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)
        val txtTelp = findViewById<EditText>(R.id.txtTelp)
        val txtTgl = findViewById<EditText>(R.id.txtTgl)
        val txtKuliah = findViewById<EditText>(R.id.txtKuliah)

        btnSimpan.setOnClickListener{
            Toast.makeText(this, "Tersimpan", Toast.LENGTH_SHORT).show()

            val nama = txtNama.text.toString()
            val email = txtEmail.text.toString()
            val telp = txtTelp.text.toString()
            val tgl = txtTgl.text.toString()
            val kuliah = txtKuliah.text.toString().toInt()

            val intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("telp", telp)
            intent.putExtra("tgl", tgl)
            intent.putExtra("kuliah", kuliah)
            startActivity(intent)
        }

        val btnLogout = findViewById<Button>(R.id.btnLogout)

        btnLogout.setOnClickListener {
            val sp = this.getSharedPreferences("My_SP", MODE_PRIVATE)
            with(sp.edit()) {
                putString("password", "")
                putString("username", "")
                apply()
            }

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

        btnBatal.setOnClickListener{
            finish()
        }
    }
}