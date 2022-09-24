fun main() {
    println("Bem Vindo ao ByteBank")

    val rafa = Funcionario(
        nome = "Rafael",
        cpf = "898.456.321.59",
        salario = 1000.0
    )

    println("Nome: ${rafa.nome}")
    println("CPF: ${rafa.cpf}")
    println("Salário: ${rafa.salario}")

    println("Bonificação: ${rafa.bonificacao()}")

}
