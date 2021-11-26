package com.example.a19630641android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val namaHasil = intent.getStringExtra("nama")
        val emailHasil = intent.getStringExtra("email")
        val telpHasil = intent.getStringExtra("telp")
        val tglHasil = intent.getStringExtra("tgl")
        val kuliahHasil = intent.getIntExtra("kuliah",0)

        val txtNamaHasil = findViewById<TextView>(R.id.txtNamaHasil)
        val txtEmailHasil = findViewById<TextView>(R.id.txtEmailHasil)
        val txtTelpHasil = findViewById<TextView>(R.id.txtTelpHasil)
        val txtTglHasil = findViewById<TextView>(R.id.txtTglHasil)
        val txtKuliahHasil = findViewById<TextView>(R.id.txtKuliahHasil)

        txtNamaHasil.setText(namaHasil)
        txtEmailHasil.setText(emailHasil)
        txtTelpHasil.setText(telpHasil)
        txtTglHasil.setText(tglHasil)
        txtKuliahHasil.setText(kuliahHasil.toString())
    }
}