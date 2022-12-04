export function valida(input) {
    const tipoDeInput = input.dataset.tipo;

    if(validadores[tipoDeInput]) {
        validadores[tipoDeInput](input);
    };

    if(input.validity.valid) {
        input.parentElement.classList.remove('input-container--invalido');
    } else {
        input.parentElement.classList.add('input-container--invalido');
    };
};

const mensagemDeErro = {
        nome: {
            valueMissing: ' O campo nome não pode estar vazio.'
        },
        email: {
            valueMissing: ' O campo email não pode estar vazio.',
            typeMismatch: 'O email digitado não é valido'
        },
        senha: {
            valueMissing: ' O campo senha não pode estar vazio.',
            patternMismatch: 'A senha deve conter: entre 6 a 12 caracteres, pelo menos uma letra maiúscula e uma letra minúscula, mas não deve conter nenhum simbolos.'
        },
        dataNascimento: {
            valueMissing: ' O campo data de nascimento não pode estar vazio.',
            customError: ' Você deve ser maior de 18 anos para se cadastrar.'
        }
}


const validadores = {
    dataNascimento:input => validaDataNascimento(input)
};


function validaDataNascimento(input) {
    const dataRecebida = new Date(input.value);
    let mensagem = '';
    
    if(!maiorQue18(dataRecebida)) {
        mensagem = 'Você deve ser maior de 18 anos para se cadastrar.';
    };
    
    input.setCustomValidity(mensagem);
};

function maiorQue18(data) {
    const dataAtual = new Date();
    const dataMais18 = new Date(data.getUTCFullYear() + 18, data.getUTCMonth(), data.getUTCDate());
    
    return dataMais18 <= dataAtual;
};













// const dataNascimento = document.querySelector('#nascimento');

// dataNascimento.addEventListener('blur', (evento) => {
//     validaDataNascimento(evento.target);
// });