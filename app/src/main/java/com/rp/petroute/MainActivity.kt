package com.rp.petroute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //comentar para cambiar vistas
        //setContentView(R.layout.activity_main_welcome)
        setContentView(R.layout.activity_login)
    }
}