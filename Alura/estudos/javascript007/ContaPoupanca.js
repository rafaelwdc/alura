import Conta from "./Conta.js";

export default class ContaPoupanca extends Conta {
    constructor(saldoInicial,cliente,agencia) {
        super(saldoInicial,cliente,agencia);
    };
};




























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