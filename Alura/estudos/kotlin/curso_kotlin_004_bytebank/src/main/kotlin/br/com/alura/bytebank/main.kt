import br.com.alura.bytebank.modelo.Endereco
import java.lang.ClassCastException

fun main() {
    println("Inicio Main")
    val entrada: String = "1.0"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na Conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor Recebido: $valorComTaxa")
    } else {
        println("Valor inválido")
    }

    funcao1()
    println("Fim Main")
}

fun funcao1() {
    println("Inicio Função 1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("ClassCastException foi pegado")
    }
    println("Fim da Função 1")
}

fun funcao2() {
    println("Inicio da Função 2")

    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }

    println("Fim da Função 2")
}





