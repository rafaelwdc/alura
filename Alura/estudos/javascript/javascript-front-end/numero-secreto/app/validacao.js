function verificaSeOChuteTemOValorValido(chute) {
    const numero = +chute;
    if(chuteForInvalido(numero)) {
        elementoChute.innerHTML += `<div>Valor inválido</div>`;
        return;
    };
    if (numeroForMaiorouMenorQueOValorPermitido(numero)) {
        elementoChute.innerHTML += `
            <div>Valor inválido: fale um número entre ${menorValor} e ${maiorValor}</div>
        `;
        return;
    };

    if(numero === numeroSecreto) {
        document.body.innerHTML = `
            <h2>Você acertou!</h2>
            <h3>Seu numero secreto era: ${numeroSecreto}</h3>
        `;
    } else if (numero > numeroSecreto) {
        elementoChute.innerHTML = `
            <div>O número secreto é menor! <i class="fa-solid fa-down-long"></i></div>
        `;
    } else {
        elementoChute.innerHTML = `
            <div>O número secreto é maior! <i class="fa-solid fa-up-long"></i></div>
        `;
    }
};

function chuteForInvalido(numero) {
    return Number.isNaN(numero);
};

function numeroForMaiorouMenorQueOValorPermitido(numero) {
    return numero > maiorValor || numero < menorValor;
};