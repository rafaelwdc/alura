export default class Cliente {
//------------------ constructor -----------------//    
        constructor(nome,cpf) {
            this.nome = nome;
            this._cpf = cpf;
        };
//--------------- getters & setters ----------------//

    get cpf() {
        this._cpf;
    };

};