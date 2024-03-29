package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import java.lang.NumberFormatException
import java.lang.RuntimeException

abstract class Conta(
    val titular: Cliente,
    val numero: Int
): Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set

    }

    init {
        println("Criando conta")
        println(this.titular.nome)
        println(this.numero)
        println(this.saldo)
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente \nsaldo atual: $saldo \nvalor a ser subtraído: $valor"
            )
        }

        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.deposita(valor)
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa: Double = valor + 0.5
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}