package com.example.mleeapp01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.String

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var  ed_name = findViewById(R.id.ed_name) as EditText ;
       var  tv_text = findViewById(R.id.tv_text) as TextView;
       var  tv_name = findViewById(R.id.tv_name) as TextView;
       var  tv_winner = findViewById(R.id.tv_winner) as TextView;
       var  tv_mmora = findViewById(R.id.tv_mmora) as TextView;
       var  tv_cmora = findViewById(R.id.tv_cmora) as TextView;
       var  btn_scissor = findViewById(R.id.btn_scissor) as RadioButton;
       var  btn_stone = findViewById(R.id.btn_stone) as RadioButton;
       var  btn_paper = findViewById(R.id.btn_paper) as RadioButton;
       var  btn_mora = findViewById(R.id.btn_mora) as Button;

        // set on-click listener
        btn_mora.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            if (ed_name.length() < 1) tv_text.text = "請輸入玩家姓名" else {
                tv_name.text = String.format("名字\n%s", ed_name.text.toString())
                if (btn_scissor.isChecked) tv_mmora.text = "我方出拳\n剪刀" else if (btn_stone.isChecked) tv_mmora.text = "我方出拳\n石頭" else tv_mmora.text = "我方出拳\n布"
                val computer = (Math.random() * 3).toInt()
                if (computer == 0) tv_cmora.text = "電腦出拳\n剪刀" else if (computer == 1) tv_cmora.text = "電腦出拳\n石頭" else tv_cmora.text = "電腦出拳\n布"
                if (btn_scissor.isChecked && computer == 2 || btn_stone.isChecked && computer == 0 ||
                        btn_paper.isChecked && computer == 1) {
                    tv_winner.text = """
            勝利者
            ${ed_name.text}
            """.trimIndent()
                    tv_text.text = "恭喜你獲勝了！！！"
                } else if (btn_scissor.isChecked && computer == 1 || btn_stone.isChecked && computer == 2 ||
                        btn_paper.isChecked && computer == 0) {
                    tv_winner.text = "勝利者\n電腦"
                    tv_text.text = "可惜，電腦獲勝了！"
                } else {
                    tv_winner.text = "勝利者\n平手"
                    tv_text.text = "平局，請再試一次！"
                }
            }
        }



    }
}