package com.estudos.cardapiorestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide() //Esconde a action bar padrão

        //Declaração e atribuição das variáveis correspondentes aos botões de cada categoria
        var sucos = sucos
        var sobremesas = sobremesa
        var pratos = pratos
        var lanches = lanches

        //Eventos de clique para cada botão levar o usuário às suas respectivas views
        sucos.setOnClickListener {
            //Atribuição e uso do método Intent para navegar entre as views
            var intent = Intent(this, Sucos::class.java)
            //"Iniciar o intent" para que a ação seja executada
            startActivity(intent)
            //"Finalizar o intent" para que o botão de voltar padrão do sistema não navegue entre views
            finish()
        }

        sobremesas.setOnClickListener {
            var intent = Intent(this, Sobremesas::class.java)
            startActivity(intent)
            finish()
        }

        pratos.setOnClickListener {
            var intent = Intent(this, Pratos::class.java)
            startActivity(intent)
            finish()
        }

        lanches.setOnClickListener {
            var intent = Intent(this, Lanches::class.java)
            startActivity(intent)
            finish()
        }
    }
}