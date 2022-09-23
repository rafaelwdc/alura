fun main() {

    println("Bem Vindo ao ByteBank")

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







//    for (i in 5 downTo 1 step 5) {
//

//
//    }
//        testaCondicoes(saldo)

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