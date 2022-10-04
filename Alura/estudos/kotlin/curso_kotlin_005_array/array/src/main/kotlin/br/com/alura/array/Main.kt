import br.com.alura.array.testa.testaForSalario
import br.com.alura.array.testa.testaIntArray

fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.5, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1

    testaForIndice(salarios, aumento)

    salarios.forEachIndexed{i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())

}

private fun testaForIndice(salarios: DoubleArray, aumento: Double) {
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.contentToString())
}





