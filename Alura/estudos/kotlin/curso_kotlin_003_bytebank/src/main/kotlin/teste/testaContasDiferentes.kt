import modelo.Conta
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCoisasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = "Rafael",
        numero = 1000
    )
    val contaPoupanca: Conta = ContaPoupanca(
        titular = "Patricky",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo modelo.Conta Poupança: ${contaPoupanca.saldo}")
    println("Saldo modelo.Conta Corrente: ${contaCorrente.saldo}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo modelo.Conta Poupança após Saque: ${contaPoupanca.saldo}")
    println("Saldo modelo.Conta Corrente após Saque: ${contaCorrente.saldo}")
    println()

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo modelo.Conta Poupança após enviar Transferência: ${contaPoupanca.saldo}")
    println("Saldo modelo.Conta Corrente após receber Transferência: ${contaCorrente.saldo}")
    println()

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo modelo.Conta Poupança após receber Transferência: ${contaPoupanca.saldo}")
    println("Saldo modelo.Conta Corrente após enviar Transferência: ${contaCorrente.saldo}")
    println()
}
