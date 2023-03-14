package br.com.alura.array.testa
 fun testaForSalario(salarios: DoubleArray, aumento: Double) {
    var indice = 0

    for (salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }
    println(salarios.contentToString())
}