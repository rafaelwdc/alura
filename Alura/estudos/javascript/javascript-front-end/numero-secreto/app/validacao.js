function verificaSeOChuteTemOValorValido(chute) {
    const numero = +chute;
    if(chuteForInvalido(numero)) {
        elementoChute.innerHTML += `<div>Valor inválido</div>`;
    };
    if (numeroForMaiorouMenorQueOValorPermitido(numero)) {
        elementoChute.innerHTML += `
            <div>Valor inválido: fale um número entre ${menorValor} e ${maiorValor}</div>
        `;
    };

    if(numero === numeroSecreto) {
        document.body.innerHTML = `
            <h2>Você acertou!</h2>
            <h3>Seu numero secreto era: ${numeroSecreto}</h3>
        `;
    }
};

function chuteForInvalido(numero) {
    return Number.isNaN(numero);
};

function numeroForMaiorouMenorQueOValorPermitido(numero) {
    return numero > maiorValor || numero < menorValor;
};