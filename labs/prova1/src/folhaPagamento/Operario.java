package folhaPagamento;

public class Operario extends Funcionario {
	private double salarioFinal;
	private String setor;
	private double valorProducao;
	
	public Operario(String nome, String cpf, String rg, int numeroCarteira, double salarioBase,
			        String setor) {
		super(nome, cpf, rg, numeroCarteira, salarioBase);
		this.setor = setor;
		
		if(this.setor.equalsIgnoreCase("A")) {
			this.valorProducao = 5000.00;
		}else if(this.setor.equalsIgnoreCase("B")) {
			this.valorProducao = 4000.00;
		}else {
			this.valorProducao = 3000.00;
		}
		
		this.salarioFinal = this.getSalarioBase() + this.valorProducao;
	}
	
	public String getFolhaPagamento() {
		return "\nNome: " + this.getNome() +
			   "\nSalario base: " + this.getSalarioBase() +
		       "\nValor de produção: " + this.valorProducao + 
		       "\nSalario final: " + this.salarioFinal;
	}
	
	public String getDados() {
		return super.getDados() + 
			   "\nSetor: " + this.setor +
			   "\nValor de producao: " + this.valorProducao +
			   "\nSalario final: " + this.salarioFinal + "\n";		
	}
	
	public double getSalarioFinal() {
		return this.salarioFinal;
	}
	
	public double getValorProducao() {
		return this.valorProducao;
	}
	
}
