import br.com.alura.bytebank.modelo.Endereco

fun main() {
    testaWith()
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
