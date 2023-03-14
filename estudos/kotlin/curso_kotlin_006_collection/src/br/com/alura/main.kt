package br.com.alura

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(4, 40.0)
    )
    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido: Pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=2, valor=60.0)])

//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//
//    println(mapa)

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf(
        "Rafael",
        "Patricky",
        "Camila",
        "Néinha",
        "Dori",
        "Steela",
        "Debler",
        "Juinha",
        "Hiro"
    )
    val agenda: Map<Char, List<String>>  = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['D'])

}

data class Pedido ( val numero: Int, val valor: Double)