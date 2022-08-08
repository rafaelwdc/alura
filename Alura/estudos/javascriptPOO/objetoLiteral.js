const user = {
    nome: "Juliana",
    email: "J@j.com",
    nascimento: "2021/01/01",
    role: "admin",
    ativo: true,
    exibirInfos: function() {
        console.log(this.nome, this.email);
    }
};

const admin = {
    nome: "Mariana",
    email: "m@m.com",
    role: "admin",
    criarCurso() {
        console.log('curso criado');
    }
};

Object.setPrototypeOf(admin,user);
admin.criarCurso();
admin.exibirInfos();







// user.exibirInfos();
// // const exibir = user.exibirInfos;
// // exibir();

// const exibir = function() {
//     console.log(this.nome);
// };

// const exibirNome = exibir.bind(user);
// exibirNome();

// exibir();