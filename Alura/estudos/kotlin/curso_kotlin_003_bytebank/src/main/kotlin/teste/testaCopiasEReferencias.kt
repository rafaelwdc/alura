import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaCamila = ContaCorrente("Camila", 1002)
    var contaHirode = ContaPoupanca("Hirode", 1003)

    println("Titular conta Camila: ${contaCamila.titular}")
    println("Titular conta Hirode: ${contaHirode.titular}")
}
