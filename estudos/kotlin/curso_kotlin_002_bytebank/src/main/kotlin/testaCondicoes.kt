fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> {
            println("Conta é Positiva")
        }
        saldo == 0.0 -> {
            println("Conta é Neutra")
        }
        else -> {
            println("Conta é negativa")
        }
    }


}