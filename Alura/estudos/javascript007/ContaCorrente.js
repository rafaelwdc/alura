import Conta from "./Conta.js";

export default class ContaCorrente extends Conta {
    static numeroDeContas = 0;
    constructor(cliente,agencia) {
        super(0,cliente,agencia);
        ContaCorrente.numeroDeContas +=1;
    };    
};






















// set cliente(novoValor) {
//     if(novoValor instanceof Cliente) {
//         this._cliente = novoValor;
//     };
// };

// get cliente() {
//     return this._cliente;
// }

// get saldo() {
//     return this._saldo;
// };

// constructor(agencia,cliente) {
//     super(agencia,cliente)
// };

// sacar(valor) {
//     if(this._saldo >= valor) {
//         this._saldo -= valor;
//         return valor;
//     };
// };

// depositar(valor) {
//     if(valor < 100) {
//         return;
//     };
//     this._saldo += valor;
// };

// transferir(valor,conta) {
//     const valorSacado =  this.sacar(valor);
//     conta.depositar = valorSacado;
// };