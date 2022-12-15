const cliente = {
    nome: "Rafael",
    idade: 29,
    email: "rafael@eu.com",
    telefone: ["11 555 555 550","11 444 444 440"],
    saldo: 200,
    efetuaPagamento: function (valor) {
        if (valor > this.saldo) {
            console.log(`Saldo insuficiente`);
        } else {
            this.saldo -= valor;
            console.log(`Pagamento realizado! Saldo atual: ${this.saldo}`);
        };
    },
};

cliente.efetuaPagamento(25);