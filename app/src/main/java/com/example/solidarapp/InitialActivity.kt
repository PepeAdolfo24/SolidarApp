package com.example.solidarapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class InitialActivity : AppCompatActivity() {
    private lateinit var btLogin1 : Button
    private lateinit var btSoyAltruista : Button
    private lateinit var btSoyCentroSocial : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial)

        btLogin1 = findViewById(R.id.btLogin1)
        btSoyAltruista = findViewById(R.id.btSoyAltruista)
        btSoyCentroSocial = findViewById(R.id.btSoyCentroSocial)

        btLogin1.setOnClickListener(){
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        btSoyAltruista.setOnClickListener(){
            val intent = Intent(this, AltruistRegisterActivity::class.java)
            startActivity(intent)
        }

        btSoyCentroSocial.setOnClickListener(){
            val intent = Intent(this, SocialCenterRegisterActivity::class.java)
            startActivity(intent)
        }
    }
}