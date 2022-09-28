import modelo.*

fun testaFuncionarios() {

    val tela = Auxiliar(
        nome = "Steela",
        cpf = "898.456.321.59",
        salario = 1000.0
    )

    val debler = Gerente(
        nome = "Debrer",
        cpf = "842.987.654-59",
        salario = 2000.0,
        senha = 1234
    )

    val juinha = Diretor(
        nome = "Eduarda Monica",
        cpf = "987.654.321-89",
        salario = 4000.0,
        senha = 4321,
        plr = 750.0
    )

    val hiro = Analista(
        nome = "Hirode",
        cpf = "846.987.654-54",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(tela)
    calculadora.registra(debler)
    calculadora.registra(juinha)
    calculadora.registra(hiro)

    println()
    println("# Criando modelo.Conta modelo.Auxiliar #")
    println()

    println("Nome: ${tela.nome}")
    println("CPF: ${tela.cpf}")
    println("Salário: ${tela.salario}")
    println("Salario com Bonificação: ${tela.bonificacao}")

    println()
    println("# Criando modelo.Conta modelo.Gerente #")
    println()

    println("Nome: ${debler.nome}")
    println("CPF: ${debler.cpf}")
    println("Salário: ${debler.salario}")
    println("Salario com Bonificação: ${debler.bonificacao}")

    println()
    println("# Criando modelo.Conta modelo.Diretor #")
    println()

    println("Nome: ${juinha.nome}")
    println("CPF: ${juinha.cpf}")
    println("Salário: ${juinha.salario}")
    println("Salario com Bonificação: ${juinha.bonificacao}")

    println()
    println("# Criando modelo.Conta modelo.Analista #")
    println()

    println("Nome: ${hiro.nome}")
    println("CPF: ${hiro.cpf}")
    println("Salário: ${hiro.salario}")
    println("Salario com Bonificação: ${hiro.bonificacao}")

    println()
    println("# Autenticando Senhas #")
    println()

    if (juinha.autentica(4321)) {
        println("Senha autenticada com sucesso")
    } else {
        println("Falha na autenticação da senha")
    }

    if (debler.autentica(1234)) {
        println("Senha autenticada com sucesso")
    } else {
        println("Falha na autenticação da senha")
    }

    println()
    println("# Usando Calculadora #")
    println()

    println("Total de bonificação: ${calculadora.total}")
}
