package escritorio;

public class Assistente extends Funcionario {
	
	public Assistente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	public double calculaSalario() {
		return super.getSalarioBase();
	}
	
	@Override
	public String toString() {
		return super.toString() + 
			   "\nSalario final: R$" + this.calculaSalario();
	}
}
