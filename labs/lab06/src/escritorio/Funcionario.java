package escritorio;

public abstract class Funcionario {
	private String nome;
	private String matricula;
	private double salarioBase;
	
	public Funcionario(String nome, String matricula, double salarioBase) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}

	public abstract double calculaSalario();
	
	public String getNome() {
		return nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome + 
			   "\nMatricula: " + matricula + 
			   "\nSalario base: R$" + salarioBase;
	}
	
	
}
