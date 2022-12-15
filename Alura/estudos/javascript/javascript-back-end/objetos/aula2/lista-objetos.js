const cliente = {
    nome: "Rafael",
    idade: 29,
    email: "rafael@eu.com",
    telefone: ["11 555 555 550","11 444 444 440"]
};

cliente.enderecos = [{
    rua: "Rua Joseph Climber",
    numero: 1337,
    apartamento: true,
    complemento: "Ap 934"
    }
];
cliente.enderecos.push({
    rua: "Rua Joseph Ladder",
    numero: 404,
    apartamento: false
})

const listaApenasApartamentos = cliente.enderecos.filter(
    (endereco) => endereco.apartamento === true
);

console.log(listaApenasApartamentos);
