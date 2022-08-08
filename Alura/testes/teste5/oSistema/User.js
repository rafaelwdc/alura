export default class User {
    constructor(login,senha) {
        this.login = login;
        this.senha = senha = "admin";
    } 
    validaSenha(senha) {
        if(senha == "admin") {
            console.log("Logado com sucesso");
        }
    }
}