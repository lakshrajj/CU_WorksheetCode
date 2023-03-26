package com.luxx.ex1_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.luxx.ex1_4.databinding.ActivityAnotherBinding

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val et = findViewById<TextView>(R.id.revTV)
        et.text = intent.getStringExtra("text");
        Toast.makeText(this, et.text, Toast.LENGTH_LONG).show()

    }
}
