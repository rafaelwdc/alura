import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.totalContas


fun main() {

    val rafael = Cliente(nome = "Rafael", cpf = "", senha = 1)
    val contaPolpanca = ContaPoupanca(titular = rafael, numero = 1000)
    val contaCorrente = ContaCorrente(titular = rafael, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: $totalContas")
}

