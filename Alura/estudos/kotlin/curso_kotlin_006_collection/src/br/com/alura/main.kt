package br.com.alura

fun main() {
    val banco = BancoDeNomes()
    banco.salva("Rafael")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Rafael",
        "Patricky",
        "Camila",
        "Mamãe",
        "Veio Tanso"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Rafael? ${nomes.contains("Rafael")}")
    println("Tamanho da Coleção ${nomes.size}")
}