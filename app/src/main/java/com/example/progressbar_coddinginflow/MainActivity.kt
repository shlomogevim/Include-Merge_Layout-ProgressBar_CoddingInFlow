package com.example.progressbar_coddinginflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_Start.setOnClickListener {
            progressBar.visibility=View.VISIBLE
        }
        button_Stop.setOnClickListener {
            progressBar.visibility=View.GONE

        }
    }
}
