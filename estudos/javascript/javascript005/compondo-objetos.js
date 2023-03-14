const cliente = {
    nome: "Andre",
    idade: 36,
    cpf: "12365423625",
    email: "andre@email.com"
};

cliente.depentendes = {
    nome: "Sara",
    parentesco: "filha",
    dataDeNascimento: "20/03/2011"

}

console.log(cliente);

cliente.depentendes.nome = "Sara Silva";

console.log(cliente);