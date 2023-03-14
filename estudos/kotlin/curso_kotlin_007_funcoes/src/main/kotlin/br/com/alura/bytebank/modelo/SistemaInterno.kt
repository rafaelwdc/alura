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
    fun entraReceiver(login: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = { }) {
        if (login.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado(this)
        } else {
            println("Falha na autenticação")
        }
    }

    fun pagamento() {
        println("Realizando pagamento")
    }


}