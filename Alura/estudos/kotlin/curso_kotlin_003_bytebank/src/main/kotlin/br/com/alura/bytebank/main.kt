import br.com.alura.bytebank.modelo.*

fun main() {

    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "000000-000"
    )

    val enderecoNovo = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "000000-000"
    )


    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${java.lang.Integer.toHexString(endereco.hashCode())}")


}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}





