
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(8190, 32582723);
		Cliente paulo = new Cliente("Paulo Silveira", "654.987.321-74", "Programador");
		conta.setTitular(paulo);
		
		//conta.numero = 1337;
		//conta.setNumero(1337);
		//System.out.println(conta.getNumero());
		
		//conta.titular = paulo;
		//paulo.setNome("Paulo Silveira");
		//conta.getTitular().setProfissao("Programador");
		//System.out.println("Olá, Sr(a). " + conta.getTitular().getNome() + ", que trabalha como " + conta.getTitular().getProfissao());
		
	}
	
}
