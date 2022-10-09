package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException


fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "Predio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser Vazio")
        println(tamanhoComplemento)
    }
    soma(1)
    soma("")
}

fun soma(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}
