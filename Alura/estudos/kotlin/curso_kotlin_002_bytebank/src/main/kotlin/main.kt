fun main() {
    println("Bem Vindo ao ByteBank")
    println()

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

