package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnStart: Button
    private lateinit var etName: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.btn_start)
        etName = findViewById(R.id.et_name)
        btnStart.setOnClickListener {

        if (etName.text.isEmpty()){
            Toast.makeText(this,"Please Enter The Name",Toast.LENGTH_SHORT).show()
        }
            else
        {
            val intent = Intent(this,QuizQuestionActivity::class.java)
            intent.putExtra(Constant.USER_NAME,etName.text.toString())
            startActivity(intent)
            finish()
        }
        }

    }
}