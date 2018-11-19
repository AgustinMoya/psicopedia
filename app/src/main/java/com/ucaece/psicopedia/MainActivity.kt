package com.ucaece.psicopedia

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //BOTON BIENESTAR
        alimentacion.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("color",R.color.bienestar)
            bundle.putCharSequence("category", "BIENESTAR")
            bundle.putCharSequence("question_3", getString(R.string.pregunta_1_bienstar))
            bundle.putCharSequence("question_3", getString(R.string.pregunta_2_bienstar))
            bundle.putCharSequence("question_3", getString(R.string.pregunta_3_bienstar))

            openActivity(bundle)
        }

        //BOTON ALIMENTACION
        bienestar.setOnClickListener {
            val bundle = Bundle()
            val res = resources
            val cont = res.getStringArray(R.array.alimen)
            bundle.putInt("color",R.color.alimentacion)
            bundle.putCharSequence("category", "ALIMENTACIÓN")
            bundle.putCharSequence("question_1", cont.get(0))
            bundle.putCharSequence("question_2", cont.get(2))
            bundle.putCharSequence("question_3", getString(R.string.pregunta_3_bienstar))

            bundle.putStringArray("contenido", cont)

            openActivity(bundle)
        }

        //BOTON SUSTANCIAS
        consultaSustancia.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("color",R.color.consumo_de_sustancias)
            bundle.putCharSequence("category", "SUSTANCIAS")
            bundle.putCharSequence("question_1", getString(R.string.pregunta_1_bienstar))
            bundle.putCharSequence("question_2", getString(R.string.pregunta_2_bienstar))
            bundle.putCharSequence("question_3", getString(R.string.pregunta_3_bienstar))
            openActivity(bundle)
        }

        //BOTON DESARROLLO SEXUAL
        desarrolloSexual.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("color",R.color.desarrollo_sexual)
            bundle.putCharSequence("category", "DESARROLLO SEXUAL")
            bundle.putCharSequence("question_1", getString(R.string.pregunta_1_bienstar))
            bundle.putCharSequence("question_2", getString(R.string.pregunta_2_bienstar))
            bundle.putCharSequence("question_3", getString(R.string.pregunta_3_bienstar))
            openActivity(bundle)
        }

        //HÁBITOS DEL BAÑO
        familia.setOnClickListener {
            val bundle = Bundle()
            val res = resources
            val contbanio = res.getStringArray(R.array.banio)
            bundle.putInt("color",R.color.habitos_del_baño)
            bundle.putCharSequence("category", "HÁBITOS DEL BAÑO")
            bundle.putCharSequence("question_1", contbanio.get(0))
            bundle.putCharSequence("question_2", contbanio.get(2))
            bundle.putCharSequence("question_3", contbanio.get(4))
            bundle.putStringArray("contenido", contbanio)
            openActivity(bundle)
        }

        //HÁBITOS DEL SUEÑO
        habitosSuenio.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("color",R.color.habitos_suenio)
            bundle.putCharSequence("category", "HÁBITOS DEL SUEÑO")
            val res = resources
            val contsuenio = res.getStringArray(R.array.suenio)
            bundle.putCharSequence("question_1", contsuenio.get(0))
            bundle.putCharSequence("question_2", contsuenio.get(2))
            bundle.putCharSequence("question_3", contsuenio.get(4))
            bundle.putStringArray("contenido", contsuenio)
            openActivity(bundle)
        }

        //HÁBITOS DEL ESTUDIO
        habitosEstudio.setOnClickListener {
            val bundle = Bundle()
            val res = resources
            val contestudio = res.getStringArray(R.array.estudio)
            bundle.putInt("color",R.color.habitos_estudio)
            bundle.putCharSequence("category", "HÁBITOS DEL ESTUDIO")
            bundle.putCharSequence("question_1", contestudio.get(0))
            bundle.putCharSequence("question_2", contestudio.get(2))
            bundle.putCharSequence("question_3", contestudio.get(4))
            bundle.putStringArray("contenido", contestudio)
            openActivity(bundle)
        }

        //TECNOLOGÍA
        tecnologia.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("color",R.color.tecnologia)
            bundle.putCharSequence("category", "TECNOLOGÍA")
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
