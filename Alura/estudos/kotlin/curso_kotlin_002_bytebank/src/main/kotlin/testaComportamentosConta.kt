fun testaComportamentosConta() {
    // Conta Rafael -> Ao instanciar um objeto ja declarar suas propriedades como parâmetro junto dos valores;
    val contaRafael = Conta(titular = "Rafael", numero = 1000)
    contaRafael.deposita(200.0)

    // Conta Patricky;
    val contaPatricky = Conta(titular = "Patricky", numero = 1001)
    contaPatricky.deposita(300.0)

    // Prints;
    println(contaRafael.titular)
    println(contaRafael.numero)
    println(contaRafael.saldo)

    println(contaPatricky.titular)
    println(contaPatricky.numero)
    println(contaPatricky.saldo)

    // Comportamentos / Metodos;
    println("Depositando na conta do ${contaRafael.titular}")
    contaRafael.deposita(50.0)
    println(contaRafael.saldo)
    println("Depositando na conta do ${contaPatricky.titular}")
    contaPatricky.deposita(70.0)
    println(contaPatricky.saldo)

    println("Sacando da conta do ${contaRafael.titular}")
    contaRafael.saca(250.0)
    println(contaRafael.saldo)

    println("Sacando da conta do ${contaPatricky.titular}")
    contaPatricky.saca(100.0)
    println(contaPatricky.saldo)


    println("Saque em Excesso na conta do titular: ${contaRafael.titular}")
    contaRafael.saca(100.0)
    println(contaRafael.saldo)

    println("Saque em Excesso na conta do titular:  ${contaPatricky.titular} ")
    contaRafael.saca(500.0)
    println(contaRafael.saldo)

    println("Transferencia da conta de ${contaPatricky.titular} para a conta de ${contaRafael.titular}")

    if (contaPatricky.transfere(300.0, contaRafael)) {
        println("Transferência sucessedida")
    } else {
        println("Falha na TransferÊncia")
    }

    println("Saldo da conta do ${contaRafael.titular}:  ${contaRafael.saldo} ")
    println("Saldo da conta do ${contaPatricky.titular}:  ${contaPatricky.saldo} ")
}
