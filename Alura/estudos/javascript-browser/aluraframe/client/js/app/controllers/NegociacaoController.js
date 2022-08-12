class NegociacaoController {
    constructor() {
        let $ = document.querySelector.bind(document);
        this._inputData = $('#data');
        this._inputQuantidade = $('#quantidade');
        this._inputValor = $('#valor');
    };

    adiciona(event) {
        event.preventDefault();
        
        let negociacao = new Negociacao(
            DateHelper.textoParaDate(this._inputData.value),
            this._inputQuantidade.value,
            this._inputValor.value
            );

            console.log(negociacao);
            console.log(DateHelper.dataParaTexto(negociacao.data));
            
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