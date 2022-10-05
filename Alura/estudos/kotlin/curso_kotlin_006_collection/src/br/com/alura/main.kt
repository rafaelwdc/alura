package br.com.alura

fun main() {

    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.00),
        Pair(2,34.00),
        3 to 50.00
    )
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido: $it")
    }
    for(p: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: R$ ${p.value}0")
    }
    pedidos[4] = 70.00
    println(pedidos)
    pedidos.put(5,80.0)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6,200.0)
    println(pedidos)
    pedidos.putIfAbsent(6,150.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3,100.0)
    println(pedidos)
    pedidos.remove(3,50.0)
    println(pedidos)
}
