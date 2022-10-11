
public class Conexao {
	public Conexao() {
		System.out.println("Abrindo conexão");
	}
	
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	
	public void close() throws Exception {
		System.out.println("Fechando conexão");
		
	}


}
