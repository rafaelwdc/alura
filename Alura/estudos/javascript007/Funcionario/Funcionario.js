export default class Funcionario {
    constructor() { 
        this.nome;
        this.salario;
        this.cpf;

        this._bonificacao = 1;
        this._senha;
    };

    autenticar(senha) {
        return senha == this._senha;
    };

    cadastrarSenha(senha) {
        this._senha = senha
    };
};
