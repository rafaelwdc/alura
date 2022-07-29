// console.log("//-----------------# 1 #-----------------//\n\n");
// let tabuada = 1;
// for(let i = 0; i <= 10; i++){
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }
// console.log("\n\n//-----------------# 2 #-----------------//\n\n");
// for(let i = 0; i <= 10; i++){
//     let tabuada = 2;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }
// console.log("\n\n//-----------------# 3 #-----------------//\n\n");

// for(let i = 0; i <= 10; i++){
//     let tabuada = 3;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }
// console.log("\n\n//-----------------# 4 #-----------------//\n\n");

// for(let i = 0; i <= 10; i++){
//     let tabuada = 4;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }
// console.log("\n\n//-----------------# 5 #-----------------//\n\n");

// for(let i = 0; i <= 10; i++){
//     let tabuada = 5;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }
// console.log("\n\n//-----------------# 6 #-----------------//\n\n");

// for(let i = 0; i <= 10; i++){
//     let tabuada = 6;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }
// console.log("\n\n//-----------------# 7 #-----------------//\n\n");
// for(let i = 0; i <= 10; i++){
//     let tabuada = 7;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }
// console.log("\n\n//-----------------# 8 #-----------------//\n\n");
// for(let i = 0; i <= 10; i++){
//     let tabuada = 8;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }
// console.log("\n\n//-----------------# 9 #-----------------//\n\n");
// for(let i = 0; i <= 10; i++){
//     let tabuada = 9;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }
// console.log("\n\n//-----------------# 10 #-----------------//\n\n");
// for(let i = 0; i <= 10; i++){
//     let tabuada = 10;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }


// console.log("\n\n//-----------------# {} #-----------------//\n\n");

// for(let i = 0; i<= 100; i++){
//     let tabuada = 13;
//     let conta = tabuada * i;
//     console.log(`${tabuada} x ${i} = ${conta}`);
// }

// const array = [1,2,3,4,5,6,7,8,9,10];



const clientes = [{
    nome: "Rafael",
    idade: 29,
    conta: 777420,
    agencia: 4200,
    saldo: 1000,
    depositar:function(valor) {this.saldo += valor; },
    sacar:function(valor) {this.saldo -= valor; },
    transferir:function(valor) {this.saldo -= valor}
},
{
    nome: "Patricky",
    idade: 31,
    conta: 420777,
    agencia: 4200,
    saldo: 1000,
    depositar:function(valor) {this.saldo += valor; },
    sacar:function(valor) {this.saldo -= valor; },
    transferir:function(valor, clientes, clientes) {this.saldo -= valor}
}]

console.log("\n\n//-----------------# {} #-----------------//\n\n");

console.log(`Sr. ${clientes[0].nome} seu saldo da conta ${clientes[0].conta} é de ${clientes[0].saldo}`);
clientes[0].depositar(50);
console.log(`Deposito Efetuado com Sucesso.`);
console.log(`Sr. ${clientes[0].nome} seu saldo da conta ${clientes[0].conta} é de ${clientes[0].saldo}`);
clientes[0].sacar(75);
console.log(`Saque Efetuado com Sucesso.`);
console.log(`Sr. ${clientes[0].nome} seu saldo da conta ${clientes[0].conta} é de ${clientes[0].saldo}`);
clientes[0].transferir(35);
console.log(`Transferência Efetuada com Sucesso.`);
console.log(`Sr. ${clientes[0].nome} seu saldo da conta ${clientes[0].conta} é de ${clientes[0].saldo}`);

console.log("\n\n//-----------------# {} #-----------------//\n\n");

console.log(`Sr. ${clientes[1].nome} seu saldo da conta ${clientes[1].conta} é de ${clientes[1].saldo}`);
clientes[1].depositar(50);
console.log(`Deposito Efetuado com Sucesso.`);
console.log(`Sr. ${clientes[1].nome} seu saldo da conta ${clientes[1].conta} é de ${clientes[1].saldo}`);
clientes[1].sacar(75);
console.log(`Saque Efetuado com Sucesso.`);
console.log(`Sr. ${clientes[1].nome} seu saldo da conta ${clientes[1].conta} é de ${clientes[1].saldo}`);
clientes[1].transferir(35);
console.log(`Transferência Efetuada com Sucesso.`);
console.log(`Sr. ${clientes[1].nome} seu saldo da conta ${clientes[1].conta} é de ${clientes[1].saldo}`);
console.log("\n\n//-----------------# {} #-----------------//\n\n");
