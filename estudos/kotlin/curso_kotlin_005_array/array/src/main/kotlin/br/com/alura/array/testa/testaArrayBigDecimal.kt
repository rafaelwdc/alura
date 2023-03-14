package br.com.alura.array.testa

import java.math.BigDecimal

private fun testaArrayBigDecimal() {
    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.00".toBigDecimal()
    salarios[2] = "3500.55".toBigDecimal()
    salarios[3] = "5000.00".toBigDecimal()
    salarios[4] = "8500.55".toBigDecimal()
    println(salarios.contentToString())
}