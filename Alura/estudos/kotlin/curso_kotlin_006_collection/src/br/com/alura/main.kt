package br.com.alura

fun main() {

    val pedidos = mapOf(Pair(1, 20.00), Pair(2,34.00), 3 to 50.00)
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido: $it")
    }
    for(pedido: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: R$ ${pedido.value}0")
    }
}
