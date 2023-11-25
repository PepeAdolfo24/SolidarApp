package com.example.solidarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class AltruistRegisterActivity : AppCompatActivity() {
    private lateinit var ivAltruistImage : ImageView
    private lateinit var etAltruistUser : EditText
    private lateinit var etAltruistEmail : EditText
    private lateinit var etAltruistPassword : EditText
    private lateinit var etAltruistConfirmPassword : EditText
    private lateinit var btAltruistRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_altruist_register)

        supportActionBar?.setTitle("Registro de donador altruista")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrow_back)

        ivAltruistImage = findViewById(R.id.ivAltruistImage)
        etAltruistUser = findViewById(R.id.etAltruistUser)
        etAltruistEmail = findViewById(R.id.etAltruistEmail)
        etAltruistPassword = findViewById(R.id.etAltruistPassword)
        etAltruistConfirmPassword = findViewById(R.id.etAltruistConfirmPassword)
        btAltruistRegister = findViewById(R.id.btAltruistRegister)

        ivAltruistImage.setImageResource(R.drawable.profile)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }
}