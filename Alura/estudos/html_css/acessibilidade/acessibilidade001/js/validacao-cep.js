document.querySelector('#cep').oninvalid = 
function() {
    this.setCustomValidity('');
    if(!this.validity.valid) {
        this.setCustomValidity('Ops! Tem algo de errado nesse campo');
        this.parentNode.classList.add('contatoCampo--erro')
    };
};