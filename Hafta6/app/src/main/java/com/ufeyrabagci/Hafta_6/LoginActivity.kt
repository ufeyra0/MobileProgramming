package com.ufeyrabagci.hafta6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Intent


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val username_editText = findViewById<EditText>(R.id.editUsername)
        val password_editText = findViewById<EditText>(R.id.editTextPassword)
        val login_button = findViewById<Button>(R.id.buttonLogin)
        val register_link = findViewById<TextView>(R.id.textViewRegisterLink)

        login_button.setOnClickListener {
            val username = username_editText.text.toString()
            val password = password_editText.text.toString()

            if (username == "admin" && password == "1234") {
                Toast.makeText(this, getString(R.string.login_success), Toast.LENGTH_SHORT).show()

                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                //sonrasında geri tuşuna basıp logine gelmesi için aşağıdaki kodu yazıyoruz
                finish()
            }
            else {
                Toast.makeText(this, getString(R.string.login_error), Toast.LENGTH_SHORT).show()
            }


        }
    }
}