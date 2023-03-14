
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(100);
		System.out.println(conta.sacar(200));
		System.out.println(conta.getSaldo());
	}
	
}
