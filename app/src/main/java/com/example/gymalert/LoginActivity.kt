package com.example.gymalert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find the button by its ID
        val loginButton: Button = findViewById(R.id.button)

        // Set OnClickListener to the button
        loginButton.setOnClickListener {
            // Create an Intent to start the TrainingActivity
            val intent = Intent(this, TrainingActivity::class.java)
            // Start the TrainingActivity
            startActivity(intent)
        }
    }
}
