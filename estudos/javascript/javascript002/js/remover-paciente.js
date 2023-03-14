//var pacientes = document.querySelectorAll(".paciente");

var tabela = document.querySelector("table");

tabela.addEventListener("dblclick", function (event) {
    event.target.parentNode.classList.add("fadeOut");
    setTimeout(function(){
        event.target.parentNode.remove();
    }, 500);

});









// var alvoEvento = event.target;
// var paiDoAlvo = alvoEvento.parentNode;
// paiDoAlvo.remove();
// console.log("Fui clicado, e removido");

// pacientes.forEach(function(paciente){
//     paciente.addEventListener("dblclick", function(){
//         console.log("fui clicado duas vezes");
//         this.remove();
//     });
// });

// console.log(pacientes);