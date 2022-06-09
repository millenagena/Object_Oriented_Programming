package administradora;

public class Vendedor extends Funcionario {
	
	private double totalVendas;
	
	public Vendedor(String nome, String RG) {
		super(nome, RG, 5000.00);
		this.totalVendas = 0;
	}
	
	public Vendedor(String nome, String RG, double totalVendas) {
		super(nome, RG, 5000.00);
		this.totalVendas = totalVendas;
	}
	
	public double getTotalVendas() {
		return totalVendas;
	}
	
	public void vende(double valorVenda) {
		this.totalVendas += valorVenda;
	}
	
	public double getSalarioTotal() {
		double salarioReceber = this.getSalarioBase() + (0.05*this.totalVendas);
		this.totalVendas = 0;
		return salarioReceber;
	}
}
