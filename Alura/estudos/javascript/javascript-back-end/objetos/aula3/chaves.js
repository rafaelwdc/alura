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

const chavesDoObjeto = Object.keys(cliente);

console.log(chavesDoObjeto);

if (!chavesDoObjeto.includes("enderecos")) {
    console.error(`É necessario ter um endereço cadastrado!`)
}