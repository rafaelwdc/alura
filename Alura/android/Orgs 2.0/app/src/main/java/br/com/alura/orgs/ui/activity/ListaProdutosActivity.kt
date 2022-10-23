package br.com.alura.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.dao.ProdutosDAO
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaProdutosActivity : AppCompatActivity(R.layout.activity_lista_produtos) {

    val dao = ProdutosDAO()
    private val adapter = ListaProdutosAdapter(context = this, produtos = dao.buscaTodos())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuraRecyclerView()
        configuraFAB()
    }

    override fun onResume() {
        super.onResume()
        adapter.atualiza(dao.buscaTodos())
    }

    private fun configuraFAB() {
        val fab = findViewById<FloatingActionButton>(R.id.activity_lista_produto_fab)
        fab.setOnClickListener {
            vaiParaFormularioProduto()
        }
    }

    private fun vaiParaFormularioProduto() {
        val intent = Intent(this, FormularioProdutoActivity::class.java)
        startActivity(intent)
    }

    private fun configuraRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.activity_lista_produto_recyclerView)
        recyclerView.adapter = adapter
    }
}


//Produto(
//                nome = "Guaraná",
//                descricao = "Suco feito de guaraná amazonense colhido no coração da Amazonia",
//                valor = BigDecimal("9.99")
//            ), Produto(
//                nome = "Suco de caju",
//                descricao = "Suco feito de caju original do Piauí",
//                valor = BigDecimal("7.99")
//            ), Produto(
//                nome = "Goiabada",
//                descricao = "Colhidas no Sul de Minas as melhores goiabas do sudeste do Brasil",
//                valor = BigDecimal("12.99")
//            )