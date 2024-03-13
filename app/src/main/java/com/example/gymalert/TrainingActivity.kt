package com.example.gymalert

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TrainingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)

        // Find the button by its ID
        val previousButton: Button = findViewById(R.id.buttonBack)

        // Set OnClickListener to the button
        previousButton.setOnClickListener {
            // Create an Intent to start the TrainingActivity
            val intent = Intent(this, LoginActivity::class.java)
            // Start the TrainingActivity
            startActivity(intent)
        }

    }
}
