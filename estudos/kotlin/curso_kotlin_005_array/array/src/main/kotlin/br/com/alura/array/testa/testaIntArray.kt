package br.com.alura.array.testa


fun testaIntArray() {
    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)
}