import br.com.alura.bytebank.modelo.Endereco

fun main() {
//    val endereco = Endereco(logradouro = "Rod. Linha Verde", numero = 15465)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    Endereco(logradouro = "Rod. Linha Verde", numero = 15465)
        .let {endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let (::println)

    listOf(Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apto"))
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let (::println)

}