package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de Frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, Manga e Maçã"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(
                nome = "Guaraná",
                descricao = "Suco feito de guaraná amazonense colhido no coração da Amazonia",
                valor = BigDecimal("9.99")
            ), Produto(
                nome = "Suco de caju",
                descricao = "Suco feito de caju original do Piauí",
                valor = BigDecimal("7.99")
            ), Produto(
                nome = "Goiabada",
                descricao = "Colhidas no Sul de Minas as melhores goiabas do sudeste do Brasil",
                valor = BigDecimal("12.99")
            )
        ))
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}