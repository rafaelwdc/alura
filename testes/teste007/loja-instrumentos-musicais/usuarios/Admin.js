import Funcionario from "./Funcionarios.js";

export default class Admin extends Funcionario {
    //- # Constructor # -\\
    constructor(nome,cpf,email,login,senha) {
        super(nome,cpf,email,login,senha);
    };
};