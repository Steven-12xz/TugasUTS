package com.example.tugasuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etNamaDepan = findViewById<EditText>(R.id.etNamaDepan)
        val etNamaBelakang = findViewById<EditText>(R.id.etNamaBelakang)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val etKonfirmasi = findViewById<EditText>(R.id.etKonfirmasi)
        val btnKirim = findViewById<Button>(R.id.btnKirim)
        val btnBatal = findViewById<Button>(R.id.btnBatal)

        btnKirim.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val namaDepan = etNamaDepan.text.toString().trim()
            val namaBelakang = etNamaBelakang.text.toString().trim()
            val password = etPassword.text.toString()
            val konfirmasi = etKonfirmasi.text.toString()

            if (username.isEmpty() || email.isEmpty() || namaDepan.isEmpty() ||
                namaBelakang.isEmpty() || password.isEmpty() || konfirmasi.isEmpty()
            ) {
                Toast.makeText(this, "Semua input harus diisi!", Toast.LENGTH_SHORT).show()
            } else if (password != konfirmasi) {
                Toast.makeText(this, "Password tidak cocok!", Toast.LENGTH_SHORT).show()
            } else {
                val namaLengkap = "$namaDepan $namaBelakang"
                Toast.makeText(this, "Pendaftaran berhasil! Selamat datang, $namaLengkap", Toast.LENGTH_LONG).show()
            }
        }

        btnBatal.setOnClickListener {
            etUsername.text.clear()
            etEmail.text.clear()
            etNamaDepan.text.clear()
            etNamaBelakang.text.clear()
            etPassword.text.clear()
            etKonfirmasi.text.clear()
            Toast.makeText(this, "Form dibersihkan", Toast.LENGTH_SHORT).show()
        }
    }
}
