function verificaSeOChuteTemOValorValido(chute) {
    const numero =+ chute;
    if(chuteForInvalido(numero)) {
        console.log('Valor inválido');
    };
    if (numeroForMaiorouMenorQueOValorPermitido(numero)) {
        console.log(`Valor inválido: o número secreto precisa estar entre ${menor-valor} e ${maior-valor}`);
    };
};

function chuteForInvalido(numero) {
    return Number.isNaN(numero);
};

function numeroForMaiorouMenorQueOValorPermitido(numero) {
    return numero > maiorValor || numero < numeroForMaiorouMenorQueOValorPermitido;
};