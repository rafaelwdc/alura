import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val testeFuncao: () -> Unit
    Endereco().let {
        it
    }
    "".let(::testeRecebeString)
    1.let {

    }
    teste (1, {})
}

fun testeRecebeString(valor: String) {

}

fun teste(teste: Int, bloco: () -> Unit) {

}