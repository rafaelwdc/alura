import br.com.alura.bytebank.modelo.*

fun main() {

    val endereco = Endereco()
    val objeto : Any = Any()

    imprime(objeto)

    imprime(1)
    imprime(1.1)
    val teste: Any = imprime(endereco)
    println(teste)
}
fun imprime(valor: Any): Any {
    println(valor)
    return valor
}





