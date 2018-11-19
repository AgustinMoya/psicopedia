package com.ucaece.psicopedia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_nota.*

class DetalleNota : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_nota)




        val title = intent.extras?.getString("titulo")
        val text = intent.extras?.getString("texto")

        titulo1.text = title
        detalle.text = text

    }
}
