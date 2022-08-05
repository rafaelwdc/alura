const chalk = require('chalk');
const fs = require('fs');

const texto = 'A interface File provê informações sobre arquivos e permite ao JavaScript a acessar seu conteúdo.São geralmente recuperados a partir de um objeto [FileList](https://developer.mozilla.org/pt-BR/docs/Web/API/FileList) que é retornado como resultado da seleção, pelo usuário, de arquivos através do elemento [<input>](https://developer.mozilla.org/pt-BR/docs/Web/Element/Input), a partir do objeto [DataTransfer](https://developer.mozilla.org/pt-BR/docs/Web/API/DataTransfer) utilizado em operações de arrastar e soltar, ou a partir da [HTMLCanvasElement](https://developer.mozilla.org/pt-BR/docs/Web/API/HTMLCanvasElement). Em Gecko, códigos com privilégios podem criar objetos File representando qualquer arquivo local sem a interação do usuário (veja [Implementation notes](https://developer.mozilla.org/pt-BR/docs/Web/API/Files#implementation_notes) para mais informações.)'

function extraiLinks(texto) {
    const regex = /\[([^\]]*)\]\((https?:\/\/[^$#\s]*.[^\s]*)\)/gm;
    const arrayResultado = [];
    let temp;
    while((temp = regex.exec(texto)) != null) {
        arrayResultado.push({ [temp[1]]: [temp[2]] });
    };

    return arrayResultado;
};

extraiLinks(texto);

function trataErro(erro) {
    throw new Error(chalk.red(erro));
};

async function pegaArquivo(caminhoDoArquivo) {
    const encoding = "UTF-8";
    try {
        const texto = await fs.promises.readFile(caminhoDoArquivo, encoding);
        console.log(chalk.green(texto));
    } catch {
        trataErro(erro);
    };
};

function pegaArquivo(caminhoDoArquivo) {
    const encoding = 'UTF-8';
    fs.promises
    .readFile(caminhoDoArquivo, encoding)
    .then((texto) => chalk.green(console.log(texto)))
    .catch((erro) => trataErro(erro));
};

function pegaArquivo(caminhoDoArquivo) {
    const encoding = 'UTF-8'
    fs.readFile(caminhoDoArquivo,encoding, (erro,texto) =>{
        if (erro) {
            trataErro(erro);
        };
        console.log(chalk.green(texto));
    });
};

pegaArquivo('./arquivos/texto1.md');






















// console.log(chalk.blue("Vamos começar"));

// const paragrafo = 'Texto retornado por uma função;';
// function texto(string) {
//     return string;
// };
// console.log(texto(paragrafo));