class NegociacaoController {
    adiciona(event) {
        event.preventDefaut();
        alert('Chamei ação no Controller');
    };
};