import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaExpressao
import java.lang.ArithmeticException
import java.lang.ClassCastException

fun main() {
    println("Inicio Main")
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
        throw ArithmeticException()
    }

    println("Fim da Função 2")
}





