class Funcionarios {
	constructor(nome, salario) {
		this.nome = nome;
		this.salario = salario;
	};
};

primeiroFuncionario = new Funcionarios("Fernando", 3200);
segundoFuncionario = new Funcionarios("Alfredo", 6000);
terceiroFuncionario = new Funcionarios("Flávio", 5000);
quartoFuncionario = new Funcionarios("Marcela", 2200);

const funcionarios = [primeiroFuncionario, segundoFuncionario, terceiroFuncionario, quartoFuncionario];
let menorSalario = 0;
let maiorSalario = 0;

 for(let atual = 0; atual <= 3; atual++) {
    if(funcionarios[atual].salario < funcionarios[menorSalario].salario) {
        menorSalario = atual;
    };

    if(funcionarios[atual].salario > funcionarios[maiorSalario].salario) {
        maiorSalario = atual;
    };
 };

 console.log(`O(A) Funcionario(a): ${funcionarios[maiorSalario].nome} tem um salario de R$ ${funcionarios[maiorSalario].salario},00 que significa que é o maior da casa.`);
 console.log(`O(A) Funcionario(a): ${funcionarios[menorSalario].nome} tem um salario de R$ ${funcionarios[menorSalario].salario},00 que significa que é o menor da casa.`);





