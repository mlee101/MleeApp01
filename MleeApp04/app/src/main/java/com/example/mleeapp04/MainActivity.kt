package com.example.mleeapp04

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var  btn_choice = findViewById(R.id.btn_choice) as Button;

        btn_choice.setOnClickListener {
            startActivityForResult(Intent(this@MainActivity, MainActivity2::class.java), 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let{
            var  tv_meal = findViewById(R.id.tv_meal) as TextView;
            if( requestCode == 1 && resultCode == Activity.RESULT_OK ){
                tv_meal.text= "飲料: ${it.getString("drink")}\n\n" +
                        "甜度: ${it.getString("sugar")}\n\n" +
                        "冰塊: ${it.getString("ice")}\n\n"

              //      (String.format("飲料: %s\n\n甜度: %s\n\n冰塊: %s\n\n", b.getString("drink"),
              //      b.getString("sugar"), b.getString("ice")));
            }
            }
        }
    }


