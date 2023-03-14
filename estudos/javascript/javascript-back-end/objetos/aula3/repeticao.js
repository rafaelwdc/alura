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

for (let chave in cliente) {
    let tipo = typeof cliente[chave];
    if (tipo != "object" && tipo != "function") {
        console.log(`A chave ${chave} tem o valor ${cliente[chave]}`);
    };
};