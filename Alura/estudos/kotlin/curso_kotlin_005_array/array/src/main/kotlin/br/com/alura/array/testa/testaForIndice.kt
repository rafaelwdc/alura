package br.com.alura.array.testa
fun testaForIndice(salarios: DoubleArray, aumento: Double) {
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.contentToString())
}
