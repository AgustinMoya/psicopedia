package com.ucaece.psicopedia

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bienestar.setOnClickListener {

            //Ejemplo boton bienestar
            val bundle = Bundle()
            bundle.putInt("color",R.color.bienestar)
            bundle.putCharSequence("category", getString(R.string.title_bienestar))
            bundle.putCharSequence("question_1", getString(R.string.pregunta_1_bienstar))
            bundle.putCharSequence("question_2", getString(R.string.pregunta_2_bienstar))
            bundle.putCharSequence("question_3", getString(R.string.pregunta_3_bienstar))
            openActivity(bundle)
        }
    }

    fun openActivity(bundle: Bundle) {
        val intent = Intent(this, PreguntasActivity::class.java)
        intent.putExtras(bundle)
        this.startActivity(intent)
    }
}
