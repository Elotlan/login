package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
const val EXTRA_MESSAGE2 = "com.example.myfirstapp.MESSAGE2"

class MainActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.editTextTextPersonName)
        password = findViewById(R.id.editText)
        val ButtonS = findViewById<Button>(R.id.button)

        password.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {

            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
               if (android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches()){
                   ButtonS.isEnabled = true
               } else {
                   ButtonS.isEnabled = false
                   email.setError("Email invalido")
               }


                //if (email.length()>0 && password.length() > 0) {
                  //  ButtonS.isEnabled = true
                //}
            }

        })
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {

        val message = email.text.toString()
        val message2 = password.text.toString()

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
            putExtra(EXTRA_MESSAGE2, message2)
        }
        startActivity(intent)
    }
}