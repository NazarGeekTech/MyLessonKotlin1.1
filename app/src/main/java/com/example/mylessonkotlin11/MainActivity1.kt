package com.example.mylessonkotlin11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.mylessonkotlin11.extension.showToast
import kotlinx.android.synthetic.main.activity_main1.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity1 : AppCompatActivity() {

    lateinit var messageEditText: EditText
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        messageEditText = findViewById(R.id.input_text)
        textView = findViewById(R.id.text_data)
        clicker.setOnClickListener {
        var text = input_text.text.toString()
            if (!text.isEmpty()){
              val  intent = Intent(this, MainActivity2::class.java)
              val message = messageEditText.text.toString()
               intent.putExtra("message_key", message)
                startActivity(intent)
            }else{
                showToast("Введите тескт")
              }
        }

        if (!intent.getStringExtra("message1").isNullOrEmpty()){
            textView.text = intent.getStringExtra("message1")
        }
    }
}

