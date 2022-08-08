import User from "./User.js";

export default class Docente extends User {
    constructor(nome,email,nascimento,role = 'Docente', ativo = true) {
        super(nome,email,nascimento,role,ativo)
    }

    aprovaEstudante(estudante, curso) {
        return `Estudante ${estudante} aprovado no curso ${curso}.`
    }
};























// const novoDocente = new Docente('Mariana','m@m.com','2021-01-01');
// console.log(novoDocente);
// console.log(novoDocente.exibirInfos());
// console.log(novoDocente.aprovaEstudante('Juliana','JS'));