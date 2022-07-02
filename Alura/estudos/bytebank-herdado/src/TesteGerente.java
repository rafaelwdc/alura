
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("654.123.987-52");
		g1.setSalario(5000.0);
		
		System.out.println("Novo gerente Cadastrado com Sucesso! Seu nome é " + g1.getNome() + ", portador do documento CPF de número " + g1.getCpf() + ", Com o salario inicial de R$ " + g1.getSalario() + ", com mais a bonificação de R$ " + g1.getBonificacao() + ", totalizando o valor de R$ " + (g1.getSalario() + g1.getBonificacao()) + ". Agora cadastre sua senha.");
		
		g1.setSenha(1234);
		
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}
}
