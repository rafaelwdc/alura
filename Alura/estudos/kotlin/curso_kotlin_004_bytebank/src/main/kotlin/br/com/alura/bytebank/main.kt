import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo : Endereco? = null
    val enderecoNaoNulo : Endereco = enderecoNulo!!
    enderecoNaoNulo.logradouro
}


