import br.com.alura.bytebank.teste.*

fun main() {
    println("Inicio Main")
    funcao1()
    println("Fim Main")
}
fun funcao1() {
    println("Inicio Função 1")
    funcao2()
    println("Fim da Função 1")
}

fun funcao2 () {
    println("Inicio da Função 2")
    for(i in 1..5) {
        println(i)
    }
    println("Fim da Função 2")
}





