import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("Inicio Main")
    10/0
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
        val endereco = Any()
        endereco as Endereco
    }
    println("Fim da Função 2")
}





