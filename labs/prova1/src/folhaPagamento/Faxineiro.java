package folhaPagamento;

public class Faxineiro extends Funcionario{

	public Faxineiro(String nome, String cpf, String rg, 
					 int numeroCarteira, double salarioBase) {
		super(nome, cpf, rg, numeroCarteira, salarioBase);
	}
	
	public String getFolhaPagamento() {
		return "\nNome: " + this.getNome() +
			   "\nSalario base: " + this.getSalarioBase() +
		       "\nSalario final: " + this.getSalarioBase();
	}
	
	public String getDados() {
		return super.getDados() + 
			   "\nSalario final: " + this.getSalarioBase() + "\n";		
	}
}
