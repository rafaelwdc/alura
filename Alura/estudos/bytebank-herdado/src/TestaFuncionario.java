
public class TestaFuncionario {

	public static void main(String[] args) {

		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("321.654.987-96");
		nico.setSalario(2600.00);
		
		System.out.println("Novo funcionario Cadastrado com Sucesso! Seu nome é " + nico.getNome() + ", portador do documento CPF de número " + nico.getCpf() + ", Com o salario inicial de R$ " + nico.getSalario() + ", com mais a bonificação de R$ " + nico.getBonificacao() + ", totalizando o valor de R$ " + (nico.getSalario() + nico.getBonificacao()) + ". ");
		
		//nico.salario = 300.0;

	}

}
