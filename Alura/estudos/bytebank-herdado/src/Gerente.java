
public class Gerente extends Funcionario {

//---- Atributos ----//

	private int senha;

	//private String nome;
	//private String cpf;
	//private double salario;
		
//---- Construtor ----//
	
	public Gerente () {
		
	}
	
//---- Senha ----//
	
	public boolean autentica (int senha) {
		if ( this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
//---- Getters e Setters ----//
	
	public void setSenha (int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao () {
		return super.getBonificacao() + super.getSalario();
	}
	
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
	
}
