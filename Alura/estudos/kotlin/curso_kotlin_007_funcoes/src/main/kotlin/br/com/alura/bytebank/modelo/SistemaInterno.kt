package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(login: Autenticavel, senha: Int, autenticado: () -> Unit = { }) {
        if (login.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }

}