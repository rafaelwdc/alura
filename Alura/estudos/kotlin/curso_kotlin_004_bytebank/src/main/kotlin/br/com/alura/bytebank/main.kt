import br.com.alura.bytebank.exception.SaldoInsuficienteException

fun main() {
    println("Inicio Main")
    testaComportamentosConta()
    println("Fim Main")
}

fun funcao1() {
    println("Inicio Função 1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi pegado")
    }
    println("Fim da Função 1")
}

fun funcao2() {
    println("Inicio da Função 2")

    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }

    println("Fim da Função 2")
}



