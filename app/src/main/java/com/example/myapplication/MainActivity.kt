package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom.setOnClickListener {
            val toast1=     Toast.makeText(this,"correct",Toast.LENGTH_LONG)
            toast1.setGravity(Gravity.TOP, 0, 0)
            toast1.show()
        }
        bottom1.setOnClickListener {
            val toast=    Toast.makeText(this,"foalse",Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()

        }
    }

}