const clientes = [
    {
        nome: "Andre",
        idade: 36,
        cpf: "12365423625",
        email: "andre@email.com",
        fones: ["552197235498","552198874324"],
        dependentes: [{
          nome: "Sara Silva",
          parentesco: "filha",
          dataNasc: "20/03/2011"},
          {
              nome:"Samia Maria",
              parentesco: "filha",
              dataNasc: "04/01/2014"
          }],
    },
    {
        nome: "Juliana",
        cpf: "567.678.678-67",
        dependentes: [{
            nome: "Sophia",
            parentesco: "filha",
            dataNasc: "30/08/2020"
        }],
    }
];

const listaDependentes = [...clientes[0].dependentes,...clientes[1].dependentes];

console.log(listaDependentes);