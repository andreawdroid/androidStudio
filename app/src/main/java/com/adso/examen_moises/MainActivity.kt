package com.adso.examen_moises

import agencia.viajes.agenciaActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btningresar = findViewById<Button>(R.id.btningresar)
        btningresar.setOnClickListener{ navigateingresar() }
    }


    private fun navigateingresar(){
        val intent=Intent(this,agenciaActivity::class.java)
        startActivity(intent)
}
}