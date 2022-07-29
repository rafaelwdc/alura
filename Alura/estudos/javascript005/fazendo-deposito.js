const cliente = {
    nome: "Andre",
    idade: 36,
    cpf: "12365423625",
    email: "andre@email.com",
    fones: ["552197235498","552198874324"],
    dependentes: [{
        nome: "Sara Silva",
        parentesco: "filha",
        dataNasc: "20/03/2011" },
        {
        nome:"Samia Maria",
        parentesco: "filha",
        dataNasc: "04/01/2014"
        }],
    saldo:100,

    depositar:function(valor)
    {
        this.saldo += valor;
    }
};

console.log(cliente.saldo);
cliente.depositar(30);
console.log(cliente.saldo);