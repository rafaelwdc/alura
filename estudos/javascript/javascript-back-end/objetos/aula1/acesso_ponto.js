const cliente = {
    nome: "André",
    idade: 32,
    cpf: "11122233344",
    email: "andre@dom.com"
};

console.log(`O nome do cliente é ${cliente.nome} e ele tem ${cliente.idade} anos de idade.`);

console.log(`Os três primeiros numeros do CPF são ${cliente.cpf.substring(0, 3)}`);