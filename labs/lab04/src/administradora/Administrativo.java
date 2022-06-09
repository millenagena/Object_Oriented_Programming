package administradora;

public class Administrativo extends Funcionario {
	
	public int horasExtras;

	public Administrativo(String nome, String RG) {
		super(nome, RG, 10000.00);
		this.horasExtras = 0;
	}
	
	public Administrativo(String nome, String RG, int horasExtras) {
		super(nome, RG, 10000.00);
		this.horasExtras = horasExtras;
	}
	
	public int getHorasExtras() {
		return horasExtras;
	}
	
	public void trabalhoExtra(int qntdHoras) {
		this.horasExtras += qntdHoras;
	}
	
	public double getSalarioTotal() {
		double salarioReceber = this.getSalarioBase() + ((this.getSalarioBase()/100)*this.horasExtras);
		this.horasExtras = 0;
		return salarioReceber;
	
	}
	
	
}
