class Produto {

    constructor(nome, preco) {
        this.nome = nome;
        this.preco = preco;
    };

};

let produto1 = new Produto("Lamborghini", 1000000);
let produto2 = new Produto("Jipe", 46000);
let produto3 = new Produto("Brasília", 16000);
let produto4 = new Produto("Smart", 46000);
let produto5 = new Produto("Fusca", 18000);

let produtos = [produto1, produto2, produto3, produto4, produto5];

let maisBarato = 0;
for( let atual = 0 ; atual <= produtos.length ; atual++ ) {
    carroMaisBarato(produtos,atual,maisBarato);
};

console.log(maisBarato);
console.log(`O carro ${produtos[maisBarato].nome} é o mais barato e custa R$ ${produtos[maisBarato].preco}`);

function carroMaisBarato(produtos,atual,maisBarato) {
    if(produtos[atual].preco < produtos[maisBarato].preco) {
        maisBarato = atual;
    };
};





primeiroProduto = ("Lamborghini", 1000000);
segundoProduto = ("Jipe",  46000);
terceiroProduto = ("Brasilia", 16000);
quartoProduto =	("Smart", 46000);
quintoProduto = ("Fusca", 18000);

produtors = [primeiroProduto,segundoProduto,terceiroProduto,quartoProduto,quintoProduto]


console.log(produtors[1]);





























// const precos = [];

// precos[0] = 1000000;
// precos[1] = 46000;
// precos[2] = 16000;
// precos[3] = 46000;
// precos[4] = 18000;


// console.log(precos);