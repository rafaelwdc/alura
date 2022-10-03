import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    // modelo.Conta Rafael -> Ao instanciar um objeto ja declarar suas propriedades como parâmetro junto dos valores;


    val clienteRafael = Cliente(nome = "Rafael", cpf = "864.351.684-59", senha = 1234)
    val clientePatricky = Cliente(nome = "Patricky", cpf = "864.315.681-60", senha = 1234)

    val contaRafael = ContaCorrente(titular = clienteRafael, numero = 1000)
    contaRafael.deposita(200.0)

    // modelo.Conta Patricky;
    val contaPatricky = ContaPoupanca(titular = clientePatricky, numero = 1001)
    contaPatricky.deposita(300.0)

    // Prints;
    println(contaRafael.titular.nome)
    println(contaRafael.numero)
    println(contaRafael.saldo)

    println(contaPatricky.titular.nome)
    println(contaPatricky.numero)
    println(contaPatricky.saldo)

    // Comportamentos / Metodos;
    println("Depositando na conta do ${contaRafael.titular.nome}")
    contaRafael.deposita(50.0)
    println(contaRafael.saldo)
    println("Depositando na conta do ${contaPatricky.titular.nome}")
    contaPatricky.deposita(70.0)
    println(contaPatricky.saldo)

    println("Sacando da conta do ${contaRafael.titular.nome}")
    contaRafael.saca(250.0)
    println(contaRafael.saldo)

    println("Sacando da conta do ${contaPatricky.titular.nome}")
    contaPatricky.saca(100.0)
    println(contaPatricky.saldo)


    println("Saque em Excesso na conta do titular: ${contaRafael.titular.nome}")
    contaRafael.saca(100.0)
    println(contaRafael.saldo)

    println("Saque em Excesso na conta do titular:  ${contaPatricky.titular.nome} ")
    contaRafael.saca(500.0)
    println(contaRafael.saldo)

    println("Transferencia da conta de ${contaPatricky.titular.nome} para a conta de ${contaRafael.titular.nome}")

    try {
        contaPatricky.transfere(destino = contaRafael, valor = 150.0, senha = 1234)
        println("Transferência sucessedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na Transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferencia")
        println("Falha na autenticação")
        e.printStackTrace()

    }


    println("Saldo da conta do ${contaRafael.titular.nome}:  ${contaRafael.saldo} ")
    println("Saldo da conta do ${contaPatricky.titular.nome}:  ${contaPatricky.saldo} ")
}
