package com.example.solidarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class SocialCenterRegisterActivity : AppCompatActivity() {

    private lateinit var ivSocialCenterImage : ImageView
    private lateinit var etSocialCenterUser : EditText
    private lateinit var etSocialCenterEmail : EditText
    private lateinit var etSocialCenterPassword : EditText
    private lateinit var etSocialCenterConfirmPassword : EditText
    private lateinit var etSocialCenterDir : EditText
    private lateinit var etSocialCenterCol : EditText
    private lateinit var etSocialCenterCity : EditText
    private lateinit var etSocialCenterDescription : EditText
    private lateinit var btSocialCenterRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_center_register)

        supportActionBar?.setTitle("Registro de centro social")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrow_back)

        ivSocialCenterImage = findViewById(R.id.ivSocialCenterImage)
        etSocialCenterUser = findViewById(R.id.etSocialCenterUser)
        etSocialCenterEmail = findViewById(R.id.etSocialCenterEmail)
        etSocialCenterPassword = findViewById(R.id.etSocialCenterPassword)
        etSocialCenterConfirmPassword = findViewById(R.id.etSocialCenterConfirmPassword)
        etSocialCenterDir = findViewById(R.id.etSocialCenterDir)
        etSocialCenterCol = findViewById(R.id.etSocialCenterCol)
        etSocialCenterCity = findViewById(R.id.etSocialCenterCity)
        etSocialCenterDescription = findViewById(R.id.etSocialCenterDescription)
        btSocialCenterRegister = findViewById(R.id.btSocialCenterRegister)
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