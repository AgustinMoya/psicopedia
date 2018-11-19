package com.ucaece.psicopedia

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.activity_preguntas.*
import kotlinx.android.synthetic.main.content_preguntas.*

class PreguntasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntas)

        setSupportActionBar(toolbar)

        val title = intent.extras?.getString("category")
        val pregunta1 = intent.extras?.getString("question_1")
        val pregunta2 = intent.extras?.getString("question_2")
        val pregunta3 = intent.extras?.getString("question_3")
        val preguntas = intent.extras?.getStringArray("contenido")
        val color = intent.extras?.getInt("color")

        category.text = title
        question1.text = pregunta1
        question2.text = pregunta2
        question3.text = pregunta3
        imageCategory.setImageResource(color!!)







        //BOTON 1
        question1.setOnClickListener{
            val bundle = Bundle()
            val boton1 = intent.extras?.getString("category") + "Pregunta1"


            bundle.run {
                putCharSequence("titulo", preguntas?.get(0))
                putCharSequence("texto", preguntas?.get(1))
            }
            openActivity(bundle)
        }

        question2.setOnClickListener{
            val bundle = Bundle()
            bundle.run {
                putCharSequence("titulo", preguntas?.get(2))
                putCharSequence("texto", preguntas?.get(3))
            }
            openActivity(bundle)
        }

        question3.setOnClickListener{
            val bundle = Bundle()
            bundle.run {
                putCharSequence("titulo", preguntas?.get(4))
                putCharSequence("texto", preguntas?.get(5))
            }
            openActivity(bundle)
        }


    }
    fun openActivity(bundle: Bundle) {
        val intent = Intent(this, DetalleNota::class.java)
        intent.putExtras(bundle)
        this.startActivity(intent)
    }
}
