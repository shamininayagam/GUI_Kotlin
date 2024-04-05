package com.example.gui_components

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 =findViewById<Button>(R.id.button1)
        val btn2 =findViewById<Button>(R.id.button2)
        val btn3 =findViewById<Button>(R.id.button3)
        val txt =findViewById<TextView>(R.id.text)
        val pg=findViewById<LinearLayout>(R.id.page)
        btn1.setOnClickListener {
            txt.setTextSize(TypedValue.COMPLEX_UNIT_SP,28f)
            Toast.makeText(this,"font size changed",Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {
            txt.setTextColor(Color.BLUE)
            Toast.makeText(this,"font colour changed",Toast.LENGTH_SHORT).show()

        }
        btn3.setOnClickListener {
            pg.setBackgroundColor(Color.LTGRAY)
            Toast.makeText(this,"background color changed",Toast.LENGTH_SHORT).show()

        }

    }
}