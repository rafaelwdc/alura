
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
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

//	private int senha; 
//	
//	public Gerente () {
//		
//	}
//	public double getBonificacao () {
//		return super.getSalario();
//	}
//	
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
}

	
	
//---- Atributos ----//

//	private int senha;

	//private String nome;
	//private String cpf;
	//private double salario;
		
//---- Construtor ----//
	
	
//---- Getters e Setters ----//
	
//	public void setSenha (int senha) {
//		this.senha = senha;
//	}
	

	
	//public String getNome () {
	//	return nome;
	//}
	
	//public void setNome (String nome) {
	//	this.nome = nome;
	//}
	
	//public String getCpf () {
	//	return cpf;
	//}
	
	//public void setCpf (String cpf) {
	//	this.cpf = cpf;
	//}
	
	//public double getSalario() {
	//	return salario;
	//}
	
	//public void setSalario(double salario) {
	//	this.salario = salario;
	//}
	
	//---- Senha ----//
		
	//	public boolean autentica (int senha) {
	//		if ( this.senha == senha) {
	//			return true;
	//		} else {
	//			return false;
	//		}
	//	}
	
//}
