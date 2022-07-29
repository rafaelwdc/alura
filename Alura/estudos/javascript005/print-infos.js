const cliente = {
    nome: "Andre",
    idade: 36,
    cpf: "12365423625",
    email: "andre@email.com"
};

console.log(`Sr. ${cliente.nome}, com ${cliente.idade} anos de idade, Portador do CPF: ${cliente.cpf.substring(0,3)}.XXX.XXX-${cliente.cpf.substring(3,3)}`);

