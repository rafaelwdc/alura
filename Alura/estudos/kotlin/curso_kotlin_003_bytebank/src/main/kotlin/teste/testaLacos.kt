fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Rafael $i"
        val numerConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da modelo.Conta: $numerConta")
        println("Saldo da modelo.Conta: $saldo")
        println("")
        i++
    }

    for (i in 5 downTo 1 step 5) {

        val titular: String = "Rafael $i"
        val numerConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da modelo.Conta: $numerConta")
        println("Saldo da modelo.Conta: $saldo")
        println("")

    }
}
