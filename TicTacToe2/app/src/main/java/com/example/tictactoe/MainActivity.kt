package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var input1: EditText
    private lateinit var input2: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView=findViewById(R.id.textView)
        input1=findViewById(R.id.input1)
        input2=findViewById(R.id.input2)
        button=findViewById(R.id.button)

        button.setOnClickListener {
            val player1 = input1.text.toString()
            val player2 = input2.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Player1", player1)
            intent.putExtra("Player2", player2)
            startActivity(intent)
            finish()
        }

    }
}