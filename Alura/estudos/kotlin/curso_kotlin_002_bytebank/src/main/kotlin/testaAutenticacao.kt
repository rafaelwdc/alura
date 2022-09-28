fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Rafael",
        cpf = "846.654.321-59",
        salario = 1000.0,
        senha = 1001
    )
    val diretor = Diretor(
        nome = "Patricky",
        cpf = "684.489.945-26",
        salario = 2000.0,
        senha = 2002,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Camila",
        cpf = "684.957.654-79",
        senha = 3003
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1001)
    sistema.entra(diretor, 2002)
//    sistema.entra(cliente,3003)
}