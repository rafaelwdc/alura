import br.com.alura.bytebank.modelo.*

fun main() {

    val patricky = object: Autenticavel {
        val nome: String = "Patricky"
        val cpf: String = "xxx.xxx.xxx-xx"
        val senha: Int = 1234

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(login = patricky, senha = 1234)
    println("Nome do Cliente ${patricky.nome}")



    val rafael = Cliente(nome = "Rafael", cpf = "", senha = 1)
    val contaPolpanca = ContaPoupanca(titular = rafael, numero = 1000)
    val contaCorrente = ContaCorrente(titular = rafael, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}

