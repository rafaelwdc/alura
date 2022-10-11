class DateHelper {

    constructor() {
        throw new Error('Esta classe não pode ser instanciada');
    };
    
    static dataParaTexto(data) {
        return `${data.getDate()}/${data.getMonth() + 1}/${data.getFullYear()}`
    };

    static textoParaDate(texto) {

        if(/\D{4}-\D.{2}-\d{2}/.test(texto)) 
            throw new Error(`Deve estar no formato aaaa-mm-dd`);
        
        return Date(...texto.split('-').map((item, indice) => item - indice % 2));
        
    };


};