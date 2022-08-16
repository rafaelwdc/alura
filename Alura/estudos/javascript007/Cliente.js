export default class Cliente {
    nome;
    _cpf;

//--------------- getters & setters ----------------//

    get cpf() {
        this._cpf;
    };

//------------------ constructor -----------------//

    constructor(nome,cpf) {
        this.nome = nome;
        this._cpf = cpf;
    };

};