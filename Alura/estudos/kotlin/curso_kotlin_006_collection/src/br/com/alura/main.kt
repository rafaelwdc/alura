package br.com.alura

fun main() {
    val nomes: List<String> = listOf(
        "Rafael",
        "Patricky",
        "Camila",
        "Mamãe",
        "Veio Tanso"
    )
    for (nome in nomes) {
        println(nomes)
    }
    println("Tem o nome Rafael? ${nomes.contains("Rafael")}")
    println("Tamanho da Coleção ${nomes.size}")
}