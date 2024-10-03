package com.nataly.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//AppCompactActivity() herda ou importa as funções de tela do kotlin
class PrincipalActivity : AppCompatActivity() {

    //var nome_aplicativo = "Minha Calculadora"
    val nome_aplicativo_string: String = "Minha Calculadora"
    val valor_inteiro: Int = 20
    val valor_com_ponto: Float = 1250.00F
    val aprovado: Boolean = false /// true ou false somente
    val sigla_do_app: Char = 'c' //só permite uma letra, com aspas simples

  // const => faz  com que a variavel não seja alterada depois

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //seta = conteudo da view como o arquivo layout principal
        setContentView(R. layout.activity_main)

        
        val  btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtNumero: EditText = findViewById(R.id.edtNumero2)

        btnCalcular.setOnClickListener {
            val text = "Ola Mestre Jeferson"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show()

        }
    }

    fun  eventoClikBotaoCalcular() {

}
}
