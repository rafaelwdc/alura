
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.depositar(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.sacar(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.depositar(1000);
		System.out.println(contaDaMarcela.saldo);
		
		if(contaDaMarcela.transferir(300, contaDoPaulo)) {
			System.out.println("Transferencia feita com Sucesso, seu saldo é: R$ " + contaDaMarcela.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		} 
	
}
