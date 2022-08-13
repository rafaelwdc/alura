class NegociacaoController {
    constructor() {
        let $ = document.querySelector.bind(document);
        this._inputData = $('#data');
        this._inputQuantidade = $('#quantidade');
        this._inputValor = $('#valor');
        this._listaNegociacoes = new ListaNegociacoes();
    };

    adiciona(event) {
        event.preventDefault();
        this._listaNegociacoes.adiciona(this._criaNegociacao());
        this._limpaFormulario();
        console.log(this._listaNegociacoes.negociacoes);
    };
        
    _criaNegociacao(){
        return new Negociacao(
        DateHelper.textoParaDate(this._inputData.value),
        this._inputQuantidade.value,
        this._inputValor.value);
    };

    _limpaFormulario() {
        this._inputData.value = '';
        this._inputQuantidade.value = 1;
        this._inputValor.value = 0.0;
        this._inputData.focus();
    };
};
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // let diaMesAno = negociacao.data.getDate() 
    // + '/' + (negociacao.data.getMonth() + 1)
    // + '/' + negociacao.data.getFullYear();
    
    // let data = new Date(...
    //     this._inputData.value
    //         .split('-')
    //         .map((item, indice) => item - indice % 2)
    // );
    
    // let negociacao = new Negociacao(
        //     this._inputData.value,
        //     this._inputQuantidade.value,
        //     this._inputValor.value
        // );
        
        // console.log(this._inputQuantidade.value);
        // console.log(this._inputValor.value);