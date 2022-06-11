package folhaPagamento;

public class Comissionado extends Funcionario {
	private double salarioFinal;
	private double percentualComissao;
	private int itensVendidos;
	
	public Comissionado(String nome, String cpf, String rg, int numeroCarteira, double salarioBase,
			double percentualComissao, int itensVendidos) {
		
		super(nome, cpf, rg, numeroCarteira, salarioBase);
		this.percentualComissao = percentualComissao;
		this.itensVendidos = itensVendidos;
		this.salarioFinal = this.getSalarioBase() + (this.itensVendidos*(this.percentualComissao/100));
	}
	
	public String getFolhaPagamento() {
		return "\nNome: " + this.getNome() + 
			   "\nSalario base: " + this.getSalarioBase() +
			   "\nItens vendidos: " + this.itensVendidos + 
			   "\nPercentual de comissao: " + this.percentualComissao + "%" + 
		       "\nComissao total: " + (this.itensVendidos*(this.percentualComissao/100)) + 
		       "\nSalario final: " + this.salarioFinal;
	}
	
	public String getDados() {
		return super.getDados() + 
			   "\nPercentual de comissao: " + this.percentualComissao + "%" + 
			   "\nItens vendidos: " + this.itensVendidos +
			   "\nSalario final: " + this.salarioFinal + "\n";		
	}
	
	public double getSalarioFinal() {
		return this.salarioFinal;
	}
	
	public int getItensVendidos() {
		return this.itensVendidos;
	}
	
	
}
