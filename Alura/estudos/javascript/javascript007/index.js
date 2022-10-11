import Cliente from "./Cliente.js";
import Gerente from "./Funcionario/Gerente.js";
import Diretor from "./Funcionario/Diretor.js";
import SistemaAutenticacao from "./SistemaAutenticacao.js";

const diretor = new Diretor("Rafael",10000,84662415359);
diretor.cadastrarSenha("123456789");
const gerente = new Gerente("Patricky",10000,86442615348);
gerente.cadastrarSenha("123");

const cliente = new Cliente("Lais",78945612315,"456");
const diretorEstaLogado = SistemaAutenticacao.login(diretor, "123456789");
const gerenteEstaLogado = SistemaAutenticacao.login(gerente, "123");
const clienteEstaLogado = SistemaAutenticacao.login(cliente, "456");


console.log(diretorEstaLogado);
console.log(gerenteEstaLogado);
console.log(clienteEstaLogado);












// import Cliente from "./Cliente.js";
// import ContaCorrente from "./Conta/ContaCorrente.js";
// import ContaPoupanca from "./Conta/ContaPoupanca.js";
// import ContaSalario from "./Conta/ContaSalario.js";

// const cliente1 = new Cliente("Rafael",84642635184);

// const contaCorrenteRicardo = new ContaCorrente(cliente1,1001);
// const contaPoupanca = new ContaPoupanca(50,cliente1,1001);
// const contaSalario = new ContaSalario(cliente1);
// contaSalario.depositar(500);
// contaSalario.sacar(100);

// console.log(contaSalario);
// console.log(contaPoupanca);
// console.log(contaCorrenteRicardo);
// "Alicia","862.624.351-54"