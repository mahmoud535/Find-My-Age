package com.mahmoud.myfirstbroject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buClickevent(view: View) {
        val yearofpearth:Int=editTextNumber.text.toString().toInt()
        val currentyear=Calendar.getInstance().get(Calendar.YEAR)
        val age=yearofpearth-currentyear


        textView.text="YOUR Age IS"+age+"Years"

    }

}