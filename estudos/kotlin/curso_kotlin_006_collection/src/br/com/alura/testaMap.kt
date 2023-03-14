package br.com.alura
fun testaMap(pedidos: MutableMap<Int, Double>) {

    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido: $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: R$ ${p.value}0")
    }
    pedidos[4] = 70.00
    println(pedidos)

    pedidos.put(5, 80.0)
    pedidos[1] = 100.0
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.putIfAbsent(6, 150.0)
    println(pedidos)
}
