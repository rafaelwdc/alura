function exibirMensagem(texto) {console.log(texto);};
function venda(funcionario,guitarra,cliente) {
    exibirMensagem(``);
};

import Funcionario from "./usuarios/Funcionarios.js";
import Admin from "./usuarios/Admin.js";
import Cordas from "./estoque/Cordas.js";
import Cliente from "./usuarios/Cliente.js";

const guitarra = new Cordas('LDT','EDP','Guitarra LDT Prata com captação de dois Humbuckers e escala completa com 24 casas','R$1499,99','Guitarra','6 Cordas','Escala Standart com 24 casas','Les Paul','2 Humbuckers ponte/escala');

const cliente = new Cliente('Cliente','XXX.XXX.XXX-XX','cliente@loja.com','Cartão de Credito')
const funcionario = new Funcionario('Rafael','rafa','1234');
const admin = new Admin('Rafael','rafa','1234');

exibirMensagem(cliente);
exibirMensagem(funcionario);
exibirMensagem(admin);
exibirMensagem('#######################')
exibirMensagem(guitarra.especificacoes)
