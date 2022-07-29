package salario;

import java.io.Serializable;

public class Funcionario implements Serializable{
	private String cpf;
	private Double valor;
	
	public Funcionario(String cpf, Double valor) {
		this.cpf = cpf;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", valor=" + valor + "]";
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	
}
