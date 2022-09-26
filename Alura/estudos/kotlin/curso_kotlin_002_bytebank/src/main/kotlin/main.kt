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
    val juinhaChefao = Diretor(
        nome = "Eduarda Monica",
        cpf = "987.654.321-89",
        salario = 4000.0,
        senha = 4321,
        plr = 750.0
    )

    println()

    println("Nome: ${rafaelFuncionario.nome}")
    println("CPF: ${rafaelFuncionario.cpf}")
    println("Salário: ${rafaelFuncionario.salario}")
    println("Salario com Bonificação: ${rafaelFuncionario.bonificacao}")

    println()

    println("Nome: ${patrickyGerente.nome}")
    println("CPF: ${patrickyGerente.cpf}")
    println("Salário: ${patrickyGerente.salario}")
    println("Salário: ${patrickyGerente.bonificacao}")

    println()

    println("Nome: ${juinhaChefao.nome}")
    println("CPF: ${juinhaChefao.cpf}")
    println("Salário: ${juinhaChefao.salario}")
    println("Salário: ${juinhaChefao.bonificacao}")

    println()

    if(juinhaChefao.autentica(4321)) {
        println("Senha autenticada com sucesso")
    } else {
        println("Falha na autenticação da senha")
    }

    if(patrickyGerente.autentica(1234)) {
        println("Senha autenticada com sucesso")
    } else {
        println("Falha na autenticação da senha")
    }

}
