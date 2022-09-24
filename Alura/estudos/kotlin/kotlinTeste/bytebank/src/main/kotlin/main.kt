fun main() {
    println("Bem Vindo ao ByteBank")

    // Conta Rafael
    val contaRafael = Conta()
    contaRafael.titular = "Rafael"
    contaRafael.numero = 1000
    contaRafael.deposita(200.0)

    // Conta Patricky
    val contaPatricky = Conta()
    contaPatricky.titular = "Patricky"
    contaPatricky.numero = 1001
    contaPatricky.deposita(300.0)

    // Prints
    println(contaRafael.titular)
    println(contaRafael.numero)
    println(contaRafael.saldo)

    println(contaPatricky.titular)
    println(contaPatricky.numero)
    println(contaPatricky.saldo)

    // Comportamentos / Metodos
    println("Depositando na conta do ${contaRafael.titular}")
    contaRafael.deposita(50.0)
    println(contaRafael.saldo)
    println("Depositando na conta do ${contaPatricky.titular}")
    contaPatricky.deposita(70.0)
    println(contaPatricky.saldo)

    println("Sacando da conta do ${contaRafael.titular}")
    contaRafael.saca(250.0)
    println(contaRafael.saldo)

    println("Sacando da conta do ${contaPatricky.titular}")
    contaPatricky.saca(100.0)
    println(contaPatricky.saldo)


    println("Saque em Excesso na conta do titular: ${contaRafael.titular}")
    contaRafael.saca(100.0)
    println(contaRafael.saldo)

    println("Saque em Excesso na conta do titular:  ${contaPatricky.titular} ")
    contaRafael.saca(500.0)
    println(contaRafael.saldo)

    println("Transferencia da conta de ${contaPatricky.titular} para a conta de ${contaRafael.titular}")

    if(contaPatricky.transfere(300.0,contaRafael)) {
        println("Transferência sucessedida")
    } else {
        println("Falha na TransferÊncia")
    }

    println("Saldo da conta do ${contaRafael.titular}:  ${contaRafael.saldo} ")
    println("Saldo da conta do ${contaPatricky.titular}:  ${contaPatricky.saldo} ")


}

class Conta {

    // Atributos da Classe
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set

    // Comportamentos da Classe
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }


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
    while (i < 5) {
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