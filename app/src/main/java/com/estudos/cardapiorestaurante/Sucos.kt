package com.estudos.cardapiorestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar.*

class Sucos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        /*Todos os comments feitos nessa view também valem para as views de outras categorias*/
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucos)

        supportActionBar!!.hide() //Esconde a action bar

        //Utiliza a toolbar customizada criada especificamente para as views de categorias
        toolbar.title = "Sucos"
        //Define um ícone de navegação na toolbar - nesse caso, o ícone de voltar
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        //Atribui a ação de voltar à MainActivity ao clicar-se no ícone de voltar
        toolbar.setNavigationOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}