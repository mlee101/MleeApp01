package com.example.mleeapp04

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var  btn_send = findViewById(R.id.btn_send) as Button;
        var  ed_drink = findViewById(R.id.ed_drink) as EditText;
        var  radioGroup = findViewById(R.id.radioGroup) as RadioGroup;
        var  radioGroup2 = findViewById(R.id.radioGroup2) as RadioGroup;

        btn_send.setOnClickListener {
            if(ed_drink.length() < 1)
                Toast.makeText(this@MainActivity2, "input coffee or tea", Toast.LENGTH_SHORT).show()
            else {
                val b = Bundle()
                b.putString("drink", ed_drink.text.toString())
                b.putString("sugar", radioGroup.checkedRadioButtonId.toString() )
                b.putString("ice", radioGroup2.checkedRadioButtonId.toString() )
                setResult(Activity.RESULT_OK, Intent().putExtras(b))
                finish()
            }
        }

    }
}