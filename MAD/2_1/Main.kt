package com.luxx.ex1_4


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.sndBtn)
        val et = findViewById<EditText>(R.id.etMsg)


        button.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            intent.putExtra("text", et.text.toString());

            startActivity(intent)
        }
    }
}
