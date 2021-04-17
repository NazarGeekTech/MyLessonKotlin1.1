package com.example.mylessonkotlin11

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.mylessonkotlin11.extension.showToast
import kotlinx.android.synthetic.main.activity_main1.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.text_data)
        val editText: EditText = findViewById(R.id.input_data)
        val button: Button = findViewById(R.id.clicks)
        button.setOnClickListener {
            if (!input_data.text.isNullOrEmpty()){
                val intent = Intent(this, MainActivity1::class.java)
                intent.putExtra("message1", editText.text.toString())
                setResult(RESULT_OK)
                startActivityForResult(intent, 120)
                Log.d("ololo", editText.text.toString())
            }
        }
        messageTextView.text = message


    }
}