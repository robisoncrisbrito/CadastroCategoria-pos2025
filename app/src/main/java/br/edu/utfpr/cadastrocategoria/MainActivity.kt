package br.edu.utfpr.cadastrocategoria

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import br.edu.utfpr.cadastrocategoria.api.ApiCategoria
import br.edu.utfpr.cadastrocategoria.model.Categoria
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var etId: EditText
    private lateinit var etNome: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etId = findViewById(R.id.etId)
        etNome = findViewById(R.id.etNome)

    }

    fun btIncluirOnClick(view: View) {

        try {
            lifecycleScope.launch(Dispatchers.IO) {
                val id = etId.text.toString().toInt()
                val nome = etNome.text.toString()

                val categoria = Categoria(id, nome)

                ApiCategoria.retrofitService.save(categoria)

                lifecycleScope.launch(Dispatchers.Main) {
                    Toast.makeText(
                        this@MainActivity,
                        "Categoria salva com sucesso",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        } catch (ex: Exception) {
            lifecycleScope.launch(Dispatchers.Main) {
                Toast.makeText(
                    this@MainActivity,
                    "Erro ao salvar categoria",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }//fim do método incluir


    fun btAlterarOnClick(view: View) {

    }

    fun btExcluirOnClick(view: View) {

    }

    fun btPesquisarOnClick(view: View) {

    }

    fun btListarOnClick(view: View) {

    }
}