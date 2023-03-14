package br.com.alura.list

fun main() {

    listaDeLivros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )
    listaDeLivros.imprimeComMarcadores()
    listaDeLivros.remove(listaDeLivros[1])
    listaDeLivros.imprimeComMarcadores()
    val ordenadoAnoPublicacao: List<Livro> = listaDeLivros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = listaDeLivros.sortedBy { it.titulo }
    ordenadoAnoPublicacao.imprimeComMarcadores()

    listaDeLivros.sortedBy { it.autor }.imprimeComMarcadores()

    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)
}



