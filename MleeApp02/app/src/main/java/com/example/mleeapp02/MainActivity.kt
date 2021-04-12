package com.example.mleeapp02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.String

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  button = findViewById(R.id.button) as Button;
        var  ed_drink = findViewById(R.id.ed_drink) as EditText;
        var  textView = findViewById(R.id.textView) as TextView;
        var  radioButton1 = findViewById(R.id.radioButton1) as RadioButton;
        var  radioButton2 = findViewById(R.id.radioButton2) as RadioButton;
        var  radioButton3 = findViewById(R.id.radioButton3) as RadioButton;
        var  radioButton4 = findViewById(R.id.radioButton4) as RadioButton;
        var  radioButton5 = findViewById(R.id.radioButton5) as RadioButton;
        var  radioButton6 = findViewById(R.id.radioButton6) as RadioButton;
        var  radioButton7 = findViewById(R.id.radioButton7) as RadioButton;
        var  radioButton8 = findViewById(R.id.radioButton8) as RadioButton;
        var  textDrink = String();
        var  textIce = String();

        button.setOnClickListener{
            //editTextTextPersonName3.setText("aaa")
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()

            if (radioButton1.isChecked) textDrink=String("無糖") else if (radioButton2.isChecked) textDrink=String("半糖")
            else if (radioButton3.isChecked) textDrink=String("微糖") else if (radioButton4.isChecked) textDrink=String("全糖");

            if (radioButton5.isChecked) textIce=String("去冰") else if (radioButton6.isChecked) textIce=String("少氷")
            else if (radioButton7.isChecked) textIce=String("微冰") else if (radioButton8.isChecked) textIce=String("正常冰");

            textView.text = String.format("飲料:" + textDrink + ", " + textIce) ;
        }

/*
        var  editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3) as EditText;
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


 */
    }
}