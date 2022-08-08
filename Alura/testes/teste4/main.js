class Familia {
    constructor(nome,idade,grauParentesco) {
        this.nome = nome;
        this.idade = idade;
        this.grauParentesco = grauParentesco;
    };
};

class Perfil extends Familia {
    constructor(nome,idade,profissao,contribuicao) {
        super(nome,idade);
    this.profissao = profissao;
    this.contribuicao = contribuicao;
    };
};

