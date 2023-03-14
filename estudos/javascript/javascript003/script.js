// Var

var alturaVar = 5;
var comprimentoVar = 7;

areaVar = alturaVar * comprimentoVar;
console.log(areaVar);

var areaVar;

// Let


let formaLet = 'retangulo'
let alturaLet = 5;
let comprimentoLet = 7;
let areaLet;

if(formaLet === 'retangulo') {
    areaLet = alturaLet * comprimentoLet;
} else {
    areaLet = (alturaLet * comprimentoLet) / 2;
}

console.log(areaLet);


// Const

const formaConst = 'quadrado';
const alturaConst = 5;
const comprimentoConst = 7;
let areaConst;

if (formaConst === 'quadrado') {
    areaConst = alturaConst * comprimentoConst;
} else {
    areaConst = (alturaConst * comprimentoConst) / 2;
}


console.log(areaConst);