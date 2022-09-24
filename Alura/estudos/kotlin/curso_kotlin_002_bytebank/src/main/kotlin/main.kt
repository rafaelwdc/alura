fun main() {
    println("Bem Vindo ao ByteBank")

    val contaRafaFuncionario = Funcionario(
        nome = "Rafael",
        cpf = "898.456.321.59",
        salario = 1000.0,
        tipo = 0
    )

    println("Nome: ${contaRafaFuncionario.nome}")
    println("CPF: ${contaRafaFuncionario.cpf}")
    println("Salário: ${contaRafaFuncionario.salario}")

    println("Bonificação: ${contaRafaFuncionario.bonificacao()}")

}
