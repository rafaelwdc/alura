
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		int ateDoisBilhoes = 2000000000;
		long acimaDeDoisBilhoes = 9223372036854775807l; //long tem que declarar o "l" ao final da declaração.
		short valoresPequenos = 9999;
		byte menorDeclaracao = 127;
		float pontoFlutuante = 3.14f; // tem que declarar o "f" no final da variavel ou pelo casting (float) antes do seu valor.
		
		double valor1 = 0.2; 
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}
}
