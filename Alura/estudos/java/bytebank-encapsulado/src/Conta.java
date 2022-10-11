
//------------------------ Atributos ---------------------------//

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; 
	private static int total;
	
//------------------------- Construtor ---------------------------//
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Parabéns! Você acaba de criar a sua conta no [ ByteBank ]  Seja bem vindo ao time que mais"
				+ " cresce no Brasil. Sua agência é " + this.agencia + ", e sua conta é " + this.numero + ".");
		
		System.out.println("O total de contas é de " + Conta.total);
	}
	
//-------------------------- Metodos ------------------------------//
	
	public void depositar (double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar (double valor) {
		if (this.saldo >= valor) {
			
			this.saldo -= valor;
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	public boolean transferir (double valor, Conta destino) {
		if (this.saldo >= valor) {
			
			this.saldo -= valor;
			
			destino.depositar (valor);
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	//------------------ Getters e Setters ------------------//
	 
	public double getSaldo (){
		return this.saldo; 
	}
	
	public int getNumero () {
		return this.numero;
	}
	
	public void setNumero (int numero) {
		if (numero <= 0) {
			
			System.out.println ("Sua conta não pode ter numeros negativos nem ser igual a 0. Por favor, digite novamente.");
			
			return;
			
		}
		this.numero = numero;
	}
	
	public int getAgencia () {
		return this.agencia;
	}
	
	public void setAgencia (int agencia) {
		if (agencia <= 0) {
			
			System.out.println ("Não pode valores negativos ou igual a 0. Por favor, tente novamente.");
			
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular (Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular () {
		return titular;
	}
	
	public static int getTotal () {
		return Conta.total;
	}
	
}