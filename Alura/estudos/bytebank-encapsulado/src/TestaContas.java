
public class TestaContas {

	public static void main(String[] args) {
		
		Conta conta31562760 = new Conta(8190, 31562760); // Cria a conta
		Cliente maria = new Cliente("Maria Silveira", "321.654.987-58", "Desenvolvedora Front-end"); // Salva os dados do cliente
		conta31562760.setTitular(maria); // Atribui os dados na conta
		
		Conta conta32582723 = new Conta(8190, 32582723);
		Cliente paulo = new Cliente("Paulo Silveira", "654.987.321-74", "Programador");
		conta32582723.setTitular(paulo);
		
		System.out.println("O total final é de contas é: " + Conta.getTotal());

	}
	
}
