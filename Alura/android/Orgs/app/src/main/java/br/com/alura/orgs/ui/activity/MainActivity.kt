package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.dao.ProdutosDAO
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val dao = ProdutosDAO()
        Log.i("MainActivity", "onCreate: ${dao.buscaTodos()}")
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = dao.buscaTodos())
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
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