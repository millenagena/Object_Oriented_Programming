package escritorio;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	public double calculaSalario() {
		return 2*super.getSalarioBase();
	}
	
	@Override
	public String toString() {
		return super.toString() + 
			   "\nSalario final: R$" + this.calculaSalario();
	}

}
