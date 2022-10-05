package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.00),
        Pair(2, 64.00),
        3 to 50.00,
        4 to 100.00,
        5 to 100.00,
        6 to 80.00
    )
    //    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)
    val mensagem:Double? = pedidos.getOrElse(0) {
        0.0
    }

    println(mensagem)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)
    for(numero in pedidos.keys) {
        println("Pedido: $numero")
    }

    println(pedidos.values)
    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero: Int,valor: Double) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - listOf(6,5))
    println(pedidos)

//  pedidos.putAll(listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
    pedidos += listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)

    pedidos.remove(3, 100.0)
    println(pedidos)

    pedidos.remove(3, 50.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}



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
