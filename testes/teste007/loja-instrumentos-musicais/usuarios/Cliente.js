import User from "./User.js";

export default class Cliente extends User {
    //- # Constructor # -\\
    constructor(nome,cpf,email,formaDePagamento){
        super(nome,cpf,email);
        this.formaDePagamento = formaDePagamento;
    };
};