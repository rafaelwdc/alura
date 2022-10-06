import br.com.alura.bytebank.teste.teste

fun main() {
//    testaTipoFuncaoClasse()
//    testaTipoFuncaoReferencia()
    val minhaFuncaoLambda = {
        println("executa como Lambda")
    }
    println(minhaFuncaoLambda)
    val minhaFuncaoAnonima: () -> Unit = fun () {
        println("executa como Anônima")
    }
    println(minhaFuncaoAnonima)
}

private fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses())
}

private fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("Executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do teste")
    }
}