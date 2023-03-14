const cliente = {
    nome: "Andre",
    idade: 36,
    cpf: "12365423625",
    email: "andre@email.com",
    fones: ["552197235498","552198874324"],
    dependentes: [{
      nome: "Sara Silva",
      parentesco: "filha",
      dataNasc: "20/03/2011"
    }]
};

cliente.dependentes.push({
    nome:"Samia Maria",
    parentesco: "filha",
    dataNasc: "04/01/2014"
});

console.log(cliente);

const filhaMaisNova = cliente.depentendes.filter(dependente => dependente.dataNasc === '04/01/2014');

console.log(filhaMaisNova[0].nome);