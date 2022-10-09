fun main() {
    testaTipoFuncaoClasse()
    testaTipoFuncaoReferencia()
//    val minhaFuncaoLambda = {
//        println("executa como Lambda")
//    }
//    println(minhaFuncaoLambda)
//    val minhaFuncaoAnonima: () -> Unit = fun () {
//        println("executa como Anônima")
//    }
//    println(minhaFuncaoAnonima)
}

private fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasses(10,10))
}

private fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5,10))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}
