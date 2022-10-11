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


// console.log(propsClientes);

function oferecerSeguro(obj) {
    const propsClientes = Object.keys(cliente);
    if(propsClientes.includes("dependentes"))
    {
        console.log(`Oferta de seguro de vida para ${obj.nome}`);
    };

};
console.log(Object.entries(cliente));
oferecerSeguro(cliente);
