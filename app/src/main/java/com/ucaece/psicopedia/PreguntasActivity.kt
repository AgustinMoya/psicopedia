package com.ucaece.psicopedia

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

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
        val color = intent.extras?.getInt("color")

        category.text = title
        question1.text = pregunta1
        question2.text = pregunta2
        question3.text = pregunta3
        imageCategory.setImageResource(color!!)

        fab.setOnClickListener {
            Snackbar.make(it, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
