const cliente = {
    nome: "André",
    idade: 32,
    cpf: "11122233344",
    email: "andre@dom.com"
};

console.log(`O nome do cliente é ${cliente["nome"]} e ele tem ${cliente["idade"]} anos de idade.`);

const chaves = ["nome", "idade", "cpf", "email", "altura"];

chaves.forEach((chave) => {
    console.log(`A chave  ${chave} tem o valor ${cliente[chave]}`);
})