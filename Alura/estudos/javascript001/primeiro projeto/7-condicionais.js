console.log(`Trabalhando com condicionais`);

const listaDeDestinos = new Array(
    `Salvador`,
    `São Paulo`,
    `Rio de Janeiro`,
);

const idadeComprador = 17;
const estaAcompanhada = true;
listaDeDestinos.push(`Curitiba`);
console.log(`Destinos Posséveis: `);
console.log(listaDeDestinos);

if(idadeComprador >= 18){
    console.log(`Comprador maior de idade, compra efetuada.`)
    listaDeDestinos.splice(1,2);
} else if(estaAcompanhada){
    console.log(`Comprador está acompanhado, compra efetuada.`)
    listaDeDestinos.splice(1,2);
} else{
    console.log(`Não é maior de idade, não foi possivel efetuar a compra.`)
}



console.log(listaDeDestinos);