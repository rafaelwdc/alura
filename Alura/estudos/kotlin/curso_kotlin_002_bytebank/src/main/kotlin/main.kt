fun main() {
    println("Bem Vindo ao ByteBank")

    val rafaelFuncionario = Funcionario(
        nome = "Rafael",
        cpf = "898.456.321.59",
        salario = 1000.0
    )

    val patrickyGerente = Gerente(
        nome = "Patricky",
        cpf = "842.987.654-59",
        salario = 2000.0,
        senha = 1234
    )

    println()

    println("Nome: ${rafaelFuncionario.nome}")
    println("CPF: ${rafaelFuncionario.cpf}")
    println("Salário: ${rafaelFuncionario.salario}")
    println("Bonificação: ${rafaelFuncionario.bonificacao()}")
    println("Salário c/ Bonificação: ${rafaelFuncionario.salario + rafaelFuncionario.bonificacao()}")

    println()

    println("Nome: ${patrickyGerente.nome}")
    println("CPF: ${patrickyGerente.cpf}")
    println("Salário: ${patrickyGerente.salario}")
    println("Bonificação: ${patrickyGerente.bonificacao()}")
    println("Salário c/ Bonificação: ${patrickyGerente.salario + patrickyGerente.bonificacao()}")

    if(patrickyGerente.autentica(1324)) {
        println("Senha autenticada com sucesso")
    } else {
        println("Falha na autenticação da senha")
    }

}
