const numeroSecreto = gerarNumeroAleatorio();

function gerarNumeroAleatorio() {
    return parseInt(Math.random() * 100);
};

console.log(`Numero Secreto: ${numeroSecreto}`);