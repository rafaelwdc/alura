package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa: Double = valor + 0.1
        if(this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}