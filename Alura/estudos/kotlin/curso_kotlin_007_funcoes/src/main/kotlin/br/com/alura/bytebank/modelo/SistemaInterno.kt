package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(login: Autenticavel, senha: Int) {
        if (login.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

}