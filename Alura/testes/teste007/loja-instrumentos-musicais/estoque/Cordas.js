import Instrumentos from "./Instrumentos.js";

export default class Cordas extends Instrumentos {
    constructor(nome,fabricante,especificacoes,preco,tipo,quantidadeDeCordas,tipoDeEscala,formatoDoCorpo,tipoDeCaptacao) {
        super(nome,fabricante,especificacoes,preco);
        this.tipo = tipo;
        this.quantidadeDeCordas = quantidadeDeCordas;
        this.tipoDeEscala = tipoDeEscala;
        this.formatoDoCorpo = formatoDoCorpo;
        this.tipoDeCaptacao = tipoDeCaptacao;        
    };
};