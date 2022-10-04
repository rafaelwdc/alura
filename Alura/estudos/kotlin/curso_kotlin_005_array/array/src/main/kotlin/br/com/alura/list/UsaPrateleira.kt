package br.com.alura.list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()

    porAutor.imprimeComMarcadores()
    
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()


    porAnoPublicacao.imprimeComMarcadores()

}