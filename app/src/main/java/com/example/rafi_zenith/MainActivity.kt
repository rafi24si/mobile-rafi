package com.example.rafizenith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.rafi_zenith.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputAlas = findViewById<EditText>(R.id.inputAlas)
        val inputTinggi = findViewById<EditText>(R.id.inputTinggi)
        val btnSegitiga = findViewById<Button>(R.id.btnHitungSegitiga)
        val hasilSegitiga = findViewById<TextView>(R.id.hasilSegitiga)

        val inputSisi = findViewById<EditText>(R.id.inputSisi)
        val btnKubus = findViewById<Button>(R.id.btnHitungKubus)
        val hasilKubus = findViewById<TextView>(R.id.hasilKubus)

        // HITUNG LUAS SEGITIGA
        btnSegitiga.setOnClickListener {

            val alas = inputAlas.text.toString().toDoubleOrNull()
            val tinggi = inputTinggi.text.toString().toDoubleOrNull()

            if (alas == null || tinggi == null) {
                Toast.makeText(this, "Masukkan alas dan tinggi", Toast.LENGTH_SHORT).show()
            } else {

                val luas = 0.5 * alas * tinggi
                hasilSegitiga.text = "Hasil Luas Segitiga = $luas"
            }
        }

        // HITUNG VOLUME KUBUS
        btnKubus.setOnClickListener {

            val sisi = inputSisi.text.toString().toDoubleOrNull()

            if (sisi == null) {
                Toast.makeText(this, "Masukkan panjang sisi", Toast.LENGTH_SHORT).show()
            } else {

                val volume = sisi * sisi * sisi
                hasilKubus.text = "Hasil Volume Kubus = $volume"
            }
        }
    }
}