package br.edu.utfpr.cadastrocategoria

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etId : EditText
    private lateinit var etNome : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etId = findViewById(R.id.etId)
        etNome = findViewById(R.id.etNome)

    }

    fun btIncluirOnClick(view: View) {

    }
    fun btAlterarOnClick(view: View) {

    }
    fun btExcluirOnClick(view: View) {

    }
    fun btPesquisarOnClick(view: View) {

    }
    fun btListarOnClick(view: View) {

    }
}