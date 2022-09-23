fun main() {
    println("Bem Vindo ao ByteBank")
    val titular: String = "Rafael"
    val numerConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -= 1000.0

    println("Titular: $titular")
    println("Numero da Conta: $numerConta")
    println("Saldo da Conta: $saldo")

    if(saldo > 0.0) {
        println("Conta é Positiva")
    }else if (saldo == 0.0) {
        println("Conta é Neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é Neutra")
        else -> println("Conta é negativa")
    }

}