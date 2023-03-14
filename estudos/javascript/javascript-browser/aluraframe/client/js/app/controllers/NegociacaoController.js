class NegociacaoController {
    constructor() {
        let $ = document.querySelector.bind(document);

        this._inputData = $('#data');
        this._inputQuantidade = $('#quantidade');
        this._inputValor = $('#valor');
        this._listaNegociacoes = new ListaNegociacoes();

        this._negociacoesView = new NegociacoesView($('#negociacoesView'));
        this._negociacoesView.update(this._listaNegociacoes);

        this._mensagem = new Mensagem();
        this._mensagemView = new MensagemView($('#mensagemView'));
        this._mensagemView.update(this._mensagem);
    };

    adiciona(event) {
        event.preventDefault();
        this._listaNegociacoes.adiciona(this._criaNegociacao());
        this._negociacoesView.update(this._listaNegociacoes);

        this._mensagem.texto = 'Negociação adicionada com sucesso';
        this._mensagemView.update(this._mensagem);

        this._limpaFormulario();
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