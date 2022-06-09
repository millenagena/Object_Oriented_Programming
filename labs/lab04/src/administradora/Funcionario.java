package administradora;

public class Funcionario {
	private String RG;
	private String nome;
	private double salarioBase;
	
	public Funcionario(String nome, String RG, double salarioBase) {
		this.nome = nome;
		this.RG = RG;
		this.salarioBase = salarioBase;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRG() {
		return RG;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
}
