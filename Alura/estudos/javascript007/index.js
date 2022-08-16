//-----------------Classes-------------------//

//importado do arquivo Cliente.js e ContaCorrente.js

import Cliente from "./Cliente.js";
import ContaCorrente from "./ContaCorrente.js";


//-------------------Clientes--------------------//

const cliente1 = new Cliente("Rafael","846.426.351-84");
const cliente2 = new Cliente("Alicia","862.624.351-54");


const contaCorrenteRicardo = new ContaCorrente(1001, cliente1);
contaCorrenteRicardo.depositar(500);
const conta2 = new ContaCorrente(1001,cliente2);
let valor = 200;
contaCorrenteRicardo.transferir(valor, conta2);



//-----------------console.log-------------------//

console.log(contaCorrenteRicardo);
console.log(conta2);

