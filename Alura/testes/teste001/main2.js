class Clientes{
    constructor(nome,idade){
        this.nome = nome;
        this.idade = idade;
    };
};

class Conta extends Clientes{
    constructor(nome,idade,conta,agencia,digito,saldo){
        super(nome,idade);
        this.conta = conta;
        this.agencia = agencia;
        this.digito = digito;
        this.saldo = saldo;
    };

    criarConta(){
    console.log(`Sr(a) ${this.nome}, Conta criada com Sucesso.\n-- Nome: ${this.nome};\n-- Idade: ${this.idade} anos de idade;\n-- Agência: ${this.agencia};\n-- Conta: ${this.conta}-${this.digito};\n-- Saldo disponivel: R$ ${this.saldo}. \n`);
    };

    exibirSaldo(){
        console.log(`--  Olá, Sr(a) ${this.nome}. \n-- Saldo disponivel: R$ ${this.saldo}\n`);
    };

    depositar(valor) {
        this.saldo += valor; 
        console.log(`--  Olá, Sr(a) ${this.nome}. \n-- Deposito de R$ ${valor} efetuado com Sucesso! Seu saldo agora é de R$ ${this.saldo}\n`);
    };
    sacar(valor) {
        this.saldo -= valor; 
        console.log(`--  Olá, Sr(a) ${this.nome}. \n-- Saque de R$ ${valor} efetuado com Sucesso! Seu saldo agora é de R$ ${this.saldo}\n`);
    };
    transferir(valor, cliente1, cliente2) {
        cliente1.saldo -= valor;
        console.log(`--  Olá, Sr(a) ${cliente1.nome}. \n-- Trasferência para o(a) Sr(a) ${cliente2.nome} no valor de R$ ${valor} efetuada com sucesso!\n-- Saldo disponivel: R$ ${cliente1.saldo}\n`);
        cliente2.saldo += valor;
        console.log(`--  Olá, Sr(a) ${cliente2.nome}. \n-- Trasferência para o(a) Sr(a) ${cliente1.nome} no valor de R$ ${valor} efetuada com sucesso!\n-- Saldo disponivel: R$ ${cliente2.saldo}\n`);

    };
};

class ContaPoupanca extends Conta {
    constructor(nome,idade,conta,agencia,digito,saldo,saldoPoup){
        super(nome,idade,conta,agencia,digito,saldo);
        this.saldoPoup = saldoPoup;
    }
}


console.log(`\n\n//----------------------- # [ Começo ] # -----------------------//\n`);

const contaRafael = new Conta("Rafael",29,"81510030","77742","0",1000);
contaRafael.criarConta();
const contaPatricky = new Conta("Patricky",31,"81910180","77742","5",1000);
contaPatricky.criarConta();

contaPatricky.exibirSaldo();
contaRafael.exibirSaldo();

contaPatricky.depositar(1000);
contaRafael.depositar(1000);
contaPatricky.exibirSaldo();
contaRafael.exibirSaldo()

contaPatricky.sacar(500);
contaRafael.sacar(500)
contaPatricky.exibirSaldo();
contaRafael.exibirSaldo();

contaPatricky.transferir(500,contaPatricky,contaRafael);
contaRafael.transferir(500,contaRafael,contaPatricky);
contaPatricky.exibirSaldo();
contaRafael.exibirSaldo();

console.log(`//----------------------- # [ Fim ] # -----------------------//`);