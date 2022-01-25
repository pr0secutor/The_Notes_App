package com.example.thenotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.EditText






class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val button = findViewById<Button>(R.id.btn_lg)

        val mEdit: EditText

        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)

        button.setOnClickListener {

//            if(email.text.toString()=="test@admin.com" && password.text.toString()=="12345678") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                this.finish()
//            }
//            else if(email.text.toString()==null && password.text.toString()==null){
//                Toast.makeText(this, "Please Enter something", Toast.LENGTH_LONG).show()
//            }
//            else{
//                Toast.makeText(this, "Please Enter correct credentials", Toast.LENGTH_LONG).show()
//            }

        }
    }
}