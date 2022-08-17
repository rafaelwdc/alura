import User from "./User.js";

export default class Cliente extends User {
    constructor(nome,cpf,email,formaDePagamento){
        super(nome,cpf,email);
        this.formaDePagamento = formaDePagamento;
    };
};