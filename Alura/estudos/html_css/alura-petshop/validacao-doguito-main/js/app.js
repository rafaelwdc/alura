import { valida } from './validacao.js';

const inputs = document.querySelector('input');

inputs.forEach(input => {
    input.addEventListener('blur', (evento) => {
        valida(evento.target);
    });
});