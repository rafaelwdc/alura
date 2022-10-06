import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val clienteCamila = Cliente(
        nome = "Camila",
        cpf = "864.351.684-59",
        senha = 2134
    )

    val clienteHirode = Cliente(
        nome = "Hirode",
        cpf = "864.315.681-60",
        senha = 2134
    )


    val contaCamila = ContaCorrente(clienteCamila, 1002)
    var contaHirode = ContaPoupanca(clienteHirode, 1003)

    println("Titular conta Camila: ${contaCamila.titular}")
    println("Titular conta Hirode: ${contaHirode.titular}")
}
