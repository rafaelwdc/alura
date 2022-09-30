import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = Cliente(nome = "Rafael", cpf = "864.351.684-59", senha =  1234),
        numero = 1000
    )

    val contaPoupanca: Conta = ContaPoupanca(
        titular = Cliente(nome = "Patricky", cpf = "864.315.681-60", senha = 1234),
        numero = 1001
    )

    println()
    println("Titular:")
    println("Nome do titular: ${contaCorrente.titular.nome}")
    println("CPF do titular: ${contaCorrente.titular.cpf}")
    println()
    println("Titular:")
    println("Nome do titular: ${contaPoupanca.titular.nome}")
    println("CPF do titular: ${contaPoupanca.titular.cpf}")
    println()




    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo Conta Poupança: ${contaPoupanca.saldo}")
    println("Saldo Conta Corrente: ${contaCorrente.saldo}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo Conta Poupança após Saque: ${contaPoupanca.saldo}")
    println("Saldo Conta Corrente após Saque: ${contaCorrente.saldo}")
    println()

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo Conta Poupança após enviar Transferência: ${contaPoupanca.saldo}")
    println("Saldo Conta Corrente após receber Transferência: ${contaCorrente.saldo}")
    println()

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo Conta Poupança após receber Transferência: ${contaPoupanca.saldo}")
    println("Saldo Conta Corrente após enviar Transferência: ${contaCorrente.saldo}")
    println()
}
