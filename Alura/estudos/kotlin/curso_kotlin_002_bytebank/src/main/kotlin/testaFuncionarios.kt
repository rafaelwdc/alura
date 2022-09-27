fun testaFuncionarios() {
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
    val hiroAnalista = Analista(
        nome = "Hirode",
        cpf = "846.987.654-54",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(rafaelFuncionario)
    calculadora.registra(patrickyGerente)
    calculadora.registra(juinhaChefao)
    calculadora.registra(hiroAnalista)

    println()
    println("# Criando Conta Funcionario #")
    println()

    println("Nome: ${rafaelFuncionario.nome}")
    println("CPF: ${rafaelFuncionario.cpf}")
    println("Salário: ${rafaelFuncionario.salario}")
    println("Salario com Bonificação: ${rafaelFuncionario.bonificacao}")

    println()
    println("# Criando Conta Gerente #")
    println()

    println("Nome: ${patrickyGerente.nome}")
    println("CPF: ${patrickyGerente.cpf}")
    println("Salário: ${patrickyGerente.salario}")
    println("Salario com Bonificação: ${patrickyGerente.bonificacao}")

    println()
    println("# Criando Conta Diretor #")
    println()

    println("Nome: ${juinhaChefao.nome}")
    println("CPF: ${juinhaChefao.cpf}")
    println("Salário: ${juinhaChefao.salario}")
    println("Salario com Bonificação: ${juinhaChefao.bonificacao}")

    println()
    println("# Autenticando Senhas #")
    println()

    if (juinhaChefao.autentica(4321)) {
        println("Senha autenticada com sucesso")
    } else {
        println("Falha na autenticação da senha")
    }

    if (patrickyGerente.autentica(1234)) {
        println("Senha autenticada com sucesso")
    } else {
        println("Falha na autenticação da senha")
    }

    println()
    println("# Usando Calculadora #")
    println()

    println("Total de bonificação: ${calculadora.total}")
}
