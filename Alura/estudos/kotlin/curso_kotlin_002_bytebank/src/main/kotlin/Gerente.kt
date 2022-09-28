open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 3421
) {

    override val bonificacao: Double
        get() {
            return salario * 0.05
        }

}
