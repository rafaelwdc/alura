package br.com.alura.array.testa

import br.com.alura.array.bigDecimalArrayOf
import br.com.alura.array.calculaAumentoRelativo
import br.com.alura.array.media
import br.com.alura.array.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun testaBigDecimalArrayOf() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.55", "10000.00", "8500.55")
    Array<BigDecimal>(5) { BigDecimal.ZERO }
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()

    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())
    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto de 1 mes de salarios para todos funcionarios: $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto Total durante 6 meses: $gastoTotal")

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println("Media dos maiores salarios: R$ $media")
    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println("Media dos menores salarios: R$ $mediaMenoresSalarios")
}


