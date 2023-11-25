package com.example.solidarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText

class ResetPasswordActivity : AppCompatActivity() {

    private lateinit var etRecoveryEmail : EditText
    private lateinit var btRecoveryPassword : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        supportActionBar?.setTitle("Recuperar contraseña")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrow_back)

        etRecoveryEmail = findViewById(R.id.etRecoveryEmail)
        btRecoveryPassword = findViewById(R.id.btRecoveryPassword)
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