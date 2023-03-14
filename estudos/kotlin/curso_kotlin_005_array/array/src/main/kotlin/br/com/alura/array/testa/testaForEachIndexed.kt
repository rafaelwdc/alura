package br.com.alura.array.testa
fun testaForEachIndexed() {
    val salarios: DoubleArray = doubleArrayOf(1500.5, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}


