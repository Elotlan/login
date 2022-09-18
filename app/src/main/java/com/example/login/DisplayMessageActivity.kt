package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val message5 = intent.getStringExtra(EXTRA_MESSAGE2)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView4).apply {
            text = message
        }
        val textView5 = findViewById<TextView>(R.id.textView5).apply {
            text = message5
        }
    }
}