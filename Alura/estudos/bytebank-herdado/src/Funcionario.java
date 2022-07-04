
public abstract class Funcionario {

//---- Atributos ----//

	private String nome;
	private String cpf;
	private double salario;
	
//---- Construtor ----//
	
	public Funcionario () {
		
	}
	
//---- Getters e Setters ----//
	
	public abstract double getBonificacao ();// {
		//return -1; //this.salario * 0.05;
	//}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getCpf () {
		return cpf;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
