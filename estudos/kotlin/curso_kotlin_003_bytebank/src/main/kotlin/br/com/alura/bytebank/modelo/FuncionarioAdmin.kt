package br.com.alura.bytebank.modelo

abstract class FuncionarioAdmin(
     nome: String,
     cpf: String,
     salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {
    override fun autentica(senha: Int): Boolean {
        println("Autentica funcionario Admin")
        if (this.senha == senha) {
            return true
        }
        return false
    }

}