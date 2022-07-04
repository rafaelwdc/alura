
public class Administrador extends Funcionario implements Autenticavel {

    //private int senha; 
	
	private AutenticacaoUtil autenticador;
	
	public Administrador () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao () {
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	public boolean autentica (int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
}

	
//	@Override
//	public void setSenha(int senha) {
//		this.senha = senha;		
//	}
//	
//	@Override
//	public boolean autentica(int senha) {
//		if ( this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//}
	
//	private int senha;
//	
//	
//	public boolean autentica(int senha) {
//		if ( this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	public void setSenha (int senha) {
//		this.senha = senha;
//	}
//
//	@Override
//	public double getBonificacao() {
//		return 50;
//	}
//	
//}
