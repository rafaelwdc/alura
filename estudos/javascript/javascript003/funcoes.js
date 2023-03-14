// let x = " ";
// console.log(x);
// x = "oi";

//As três formas de função são:

// :: DECLARAÇÃO DE FUNCÃO ::
console.log("Desclaração de Função\n\n");
// 1) Declara a função
// Adiciona a função, dá o seu nome e parâmetro.
function imprimeTexto(texto) {
    console.log(texto);
}

// 2) Executa a função (1 ou + vezes);

imprimeTexto("oi");
imprimeTexto("outro texto");


imprimeTexto("\n"); // \n pula uma linha no console
//------------------------------------//

function soma(){
    return 2 + 2;
}

imprimeTexto(soma());