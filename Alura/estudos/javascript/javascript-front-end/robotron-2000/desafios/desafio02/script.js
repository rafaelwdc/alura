const elemento = document.querySelector('#calcular');
let resultado = document.querySelector('.resultado');
elemento.addEventListener('click', (evento) => {
    resultado.innerHTML="Fui clicado!";
});

