package com.example.solidarapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var etEmail : EditText
    private lateinit var etPassword : EditText
    private lateinit var btLogin : Button
    private lateinit var tvForgotPassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrow_back)


        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btLogin = findViewById(R.id.btLogin)
        tvForgotPassword = findViewById(R.id.tvForgotPassword)

        btLogin.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        tvForgotPassword.setOnClickListener(){
            val intent = Intent(this, ResetPasswordActivity::class.java)
            startActivity(intent)
        }

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