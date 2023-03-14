function pulaLinha(){
    document.write("<br>");
}

function mostra (frase) {
    document.write(frase);
    pulaLinha();
}

var tabuada = parseInt(prompt("Qual a tabuada que você deseja?"));

for(var contador = 1; contador <= 10; contador++) {
    mostra(taboada + " X " + contador + " = " + (taboada + contador));
}