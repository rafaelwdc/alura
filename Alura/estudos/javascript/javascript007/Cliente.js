export default class Cliente {

    constructor(nome,cpf,senha) {
        this.nome = nome;
        this._cpf = cpf;
        this._senha = senha;
    };

    get cpf() {
        this._cpf;
    };

    autenticar() {
        return true;
    };
};