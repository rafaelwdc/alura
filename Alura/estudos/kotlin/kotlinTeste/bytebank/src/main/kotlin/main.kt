fun main() {
    println("Bem Vindo ao ByteBank")

    // Conta Rafael
    val contaRafael = Conta()
    contaRafael.titular = "Rafael"
    contaRafael.numero = 1000
    contaRafael.saldo = 200.0


    // Conta Patricky
    val contaPatricky = Conta()
    contaPatricky.titular = "Patricky"
    contaPatricky.numero = 1001
    contaPatricky.saldo = 300.0

    // Prints
    println(contaRafael.titular)
    println(contaRafael.numero)
    println(contaRafael.saldo)

    println(contaPatricky.titular)
    println(contaPatricky.numero)
    println(contaPatricky.saldo)

    println("Depositando na conta do Rafael")
    deposita(contaRafael, 50.0)
    println(contaRafael.saldo)
    println("Depositando na conta do Patricky")
    deposita(contaPatricky,70.0)
    println(contaPatricky.saldo)

}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}





class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaCamila = Conta()
    contaCamila.titular = "Camila"
    var contaHirode = Conta()
    contaHirode.titular = "Hirodd"

    println("Titular conta Camila: ${contaCamila.titular}")
    println("Titular conta Hirode: ${contaHirode.titular}")
}

fun testaLacos() {
    var i = 0
    while (i  <  5) {
        val titular: String = "Rafael $i"
        val numerConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da Conta: $numerConta")
        println("Saldo da Conta: $saldo")
        println("")
        i++
    }

    for (i in 5 downTo 1 step 5) {

        val titular: String = "Rafael $i"
        val numerConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da Conta: $numerConta")
        println("Saldo da Conta: $saldo")
        println("")

    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta é Positiva")
    } else if (saldo == 0.0) {
        println("Conta é Neutra")
    } else {
        println("Conta é negativa")
    }

}



//    when {
//        saldo > 0.0 -> println("Conta é positiva")
//        saldo == 0.0 -> println("Conta é Neutra")
//        else -> println("Conta é negativa")
//
//    }