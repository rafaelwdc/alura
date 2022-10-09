fun main() {
//    testaTipoFuncaoClasse()
//    testaTipoFuncaoReferencia()

    val minhaFuncaoLambda: (Int, Int) -> Int = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(15,10))

    val minhaFuncaoAnonima: (Int, Int) -> Int = fun (a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))
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
