function Cliente(nome,cpf,email,saldo)
{
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.saldo = saldo;
    this.depositar = function(valor){this.saldo += valor};
};


function ClientePoupanca(nome,cpf,email,saldo,saldoPoup)
{
    Cliente.call(this,nome,cpf,email,saldo);
    this.saldoPoup = saldoPoup;
};
ClientePoupanca.prototype.depositarPoup = function(valor) {
    this.saldoPoup += valor;
};

const ju = new ClientePoupanca("Ju", "5588467946","ju@email.com",100,200);

console.log(ju);


ju.depositarPoup(300);

console.log(ju.saldoPoup);