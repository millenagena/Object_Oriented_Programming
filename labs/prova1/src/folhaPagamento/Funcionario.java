package folhaPagamento;

public class Funcionario {
	private String nome;
	private String CPF;
	private String RG;
	private int numeroCarteira;
	private double salarioBase;
	
	public Funcionario(String nome, String cpf, String rg, int numeroCarteira, double salarioBase) {
		this.nome = nome;
		this.CPF = cpf;
		this.RG = rg;
		this.numeroCarteira = numeroCarteira;
		this.salarioBase = salarioBase;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public String getDados() {
		return "\nNome: " + this.nome + 
			   "\nCPF: " + this.CPF + 
			   "\nRG: " + this.RG + 
			   "\nNumero carteira de trabalho: " + this.numeroCarteira + 
			   "\nSalario Base: " + this.salarioBase;
	}
	
}
