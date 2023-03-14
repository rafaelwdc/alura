fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> {
            println("modelo.Conta é Positiva")
        }
        saldo == 0.0 -> {
            println("modelo.Conta é Neutra")
        }
        else -> {
            println("modelo.Conta é negativa")
        }
    }


}