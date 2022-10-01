import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = Cliente(
            nome = "Rafael",
            cpf = "864.351.684-59",
            senha =  1234,
            endereco = Endereco(
                logradouro = "R. Hiro de Bler",
                numero = 7,
                bairro = "Santa Steelinha",
                cidade = "Salto da Juinha",
                estado = "Debler do Sul",
                cep = "800000-020",
                complemento = "Em frente a escadaria das Gatas"
            )
        ),
        numero = 1000
    )

    val contaPoupanca: Conta = ContaPoupanca(
        titular = Cliente(
            nome = "Patricky",
            cpf = "864.315.681-60",
            senha = 1234,
            endereco = Endereco(
                logradouro = "R. Hiro de Bler",
                numero = 7,
                bairro = "Santa Steelinha",
                cidade = "Salto da Juinha",
                estado = "Debler do Sul",
                cep = "800000-020",
                complemento = "Em frente a escadaria das Gatas"
            )
        ),
        numero = 1001
    )

    println()
    println("Titular Conta Corrente:")
    println("Nome: ${contaCorrente.titular.nome}")
    println("CPF: ${contaCorrente.titular.cpf}")
    println("Endereço: ${contaCorrente.titular.endereco.logradouro}, ${contaCorrente.titular.endereco.numero}\n${contaCorrente.titular.endereco.complemento}, CEP ${contaCorrente.titular.endereco.cep}\n${contaCorrente.titular.endereco.bairro}, ${contaCorrente.titular.endereco.cidade}/${contaCorrente.titular.endereco.estado}, ${contaCorrente.titular.endereco.cidade}")
    println()
    println("Titular Conta Polpança:")
    println("Nome: ${contaPoupanca.titular.nome}")
    println("CPF: ${contaPoupanca.titular.cpf}")
    println("Endereço: ${contaPoupanca.titular.endereco.logradouro}, ${contaPoupanca.titular.endereco.numero}\n${contaPoupanca.titular.endereco.complemento}, CEP ${contaPoupanca.titular.endereco.cep}\n${contaPoupanca.titular.endereco.bairro}, ${contaPoupanca.titular.endereco.cidade}/${contaPoupanca.titular.endereco.estado}, ${contaPoupanca.titular.endereco.cidade}")
    println()




    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo Conta Poupança: ${contaPoupanca.saldo}")
    println("Saldo Conta Corrente: ${contaCorrente.saldo}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo Conta Poupança após Saque: ${contaPoupanca.saldo}")
    println("Saldo Conta Corrente após Saque: ${contaCorrente.saldo}")
    println()

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo Conta Poupança após enviar Transferência: ${contaPoupanca.saldo}")
    println("Saldo Conta Corrente após receber Transferência: ${contaCorrente.saldo}")
    println()

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo Conta Poupança após receber Transferência: ${contaPoupanca.saldo}")
    println("Saldo Conta Corrente após enviar Transferência: ${contaCorrente.saldo}")
    println()
}
