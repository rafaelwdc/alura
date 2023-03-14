import User from "./User.js";

export default class Funcionario extends User {
    //- # Constructor # -\\
    constructor(nome,cpf,email,login,senha,) {
        super(nome,cpf,email);
        this._login = login;
        this._senha = senha;
    };
    
    //- # Getters & Setters # -\\
    get login() {
        return this._login
    };

    get senha() {
        return this._senha
    };

    set login(novoLogin) {
        if(novoLogin === "") {
            throw new Error('Este formato não é valido');
        };
        this._login = novoLogin;
    };

    set senha(novaSenha) {
        if(novaSenha === "") {
            throw new Error('Este formato não é valido');
        } this._senha = novaSenha;
    };
};
