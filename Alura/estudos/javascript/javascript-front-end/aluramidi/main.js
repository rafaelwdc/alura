
/*function tocaSom (idElementAudio) {   // Cria a função do som para que seja dado o comando de tocar com o .play()
   document.querySelector(idElementAudio).play(); // Adiciona através do querySelector o que for coletado na variável através da "Função do clique"
}*/

function tocaSom (seletorAudio) {
    const elemento = document.querySelector(seletorAudio);

    if (elemento && elemento.localName === 'audio') {

        elemento.play();

    }else {
        console.log('Elemento não encontrado.');
    }
}

const listaDeTeclas = document.querySelectorAll('.tecla');   // Cria a variavel que armazena a lista de teclas que estão no documento HTML



for (let contador = 0; contador < listaDeTeclas.length; contador++){ 
    const tecla = listaDeTeclas[contador];
    const instrumento = tecla.classList[1];
    const idAudio = `#som_${instrumento}`;
    tecla.onclick = function () {
        tocaSom(idAudio);
    }

    tecla.onkeydown = function (evento) {

        if (evento.code === 'Space' || evento.code === 'Enter') {
            tecla.classList.add('ativa');
        }

    }

    tecla.onkeyup = function () {
        tecla.classList.remove('ativa');
    }

}


/*
//let contador = 0; // Cria a variável que da o valor para que o contador inicie a conta do "Enquanto"

while(contador < listaDeTeclas.length){ //-> "Enquanto" é a fórmula que faz o calculo do processo

    const tecla = listaDeTeclas[contador]; //-> Cria a variável que coloca a adiciona uma tecla para ser avaliada pelo calculo

    const instrumento = tecla.classList[1]; //-> cria a variavel parte do corpo principal da função a seguir

    

    const idAudio = `#som_${instrumento}`; //-> Cria a constante que da corpo juntando o a função criada a seguir

    //console.log(idAudio);

    tecla.onclick = function () {  //-> Função do clique que inicia o processo
        tocaSom(idAudio);  //-> Junta a primeira função com a segunda unindo os dois 
    }

    contador = contador + 1; //-> Da o último parâmetro para que o processo de andamento até atingir a propriedade false e finalizar o processo

    //console.log(contador);
}



//   document.querySelector('.tecla_pom').onclick = tocaSomPom;
*/


