package br.com.alura.bytebank.teste

fun testaExpressao() {
    val entrada: String = "1.0"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na Conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = when {
        valorRecebido != null -> {
            valorRecebido + 0.1
        }

        else -> {
            null
        }
    }

    if (valorComTaxa != null) {
        println("Valor Recebido: $valorComTaxa")
    } else {
        println("Valor inválido")
    }
}
