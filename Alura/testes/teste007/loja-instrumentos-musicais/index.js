function exibirMensagem(texto) {console.log(texto);};

function venda(funcionario,instrumento,cliente) {

    exibirMensagem(`Compra efetuada com sucesso, ${instrumento.tipo}, da marca ${instrumento.fabricante}, com o modelo ${instrumento.formatoDoCorpo}, comprado pelo ${cliente.nome}, e vendido pelo vendedor:  ${funcionario.nome}`);
};

import Funcionario from "./usuarios/Funcionarios.js";
import Admin from "./usuarios/Admin.js";
import Cordas from "./estoque/Cordas.js";
import Cliente from "./usuarios/Cliente.js";

const instrumento = new Cordas('LDT','EDP','Guitarra LDT Prata com captação de dois Humbuckers e escala completa com 24 casas','R$1499,99','Guitarra','6 Cordas','Escala Standart com 24 casas','Les Paul','2 Humbuckers ponte/escala');

const cliente = new Cliente('Cliente','XXX.XXX.XXX-XX','cliente@loja.com','Cartão de Credito')
const funcionario = new Funcionario('Funcionario','func','1234');
const admin = new Admin('Admin','XXX.XXX.XXX-XX','cliente@loja.com','admin','admin');

exibirMensagem(cliente);
exibirMensagem(funcionario);
exibirMensagem(admin);
exibirMensagem('#######################');
exibirMensagem(instrumento.especificacoes);
venda(funcionario,instrumento,cliente);
