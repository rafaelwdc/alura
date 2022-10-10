import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaHOF

fun main() {
    testaHOF()
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12

    println("Taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Rafael", cpf = "864.654.321-59", senha = 4321), 1000)
    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento Mensal $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo: Double = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação de rendimento Anual $rendimentoAnual")
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
