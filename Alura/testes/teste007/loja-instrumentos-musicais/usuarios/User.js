export default class User {
    //- # Constructor # -\\
    constructor(nome,cpf,email) {
        this._nome = nome;
        this._cpf = cpf;
        this._email = email;
    };
    //- # Getters & Setters # -\\
    get nome() { return this._nome; };
};