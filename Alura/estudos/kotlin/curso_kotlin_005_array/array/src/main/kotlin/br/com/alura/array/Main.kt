import br.com.alura.array.bigDecimalArrayOf
import br.com.alura.array.somatoria
import br.com.alura.array.testa.testaIdades
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

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

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal):
        BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}
fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}