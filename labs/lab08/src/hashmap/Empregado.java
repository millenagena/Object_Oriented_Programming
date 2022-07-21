package hashmap;

public class Empregado implements Comparable{
	private String cpf;
	private int idade;
	private double salario;	
	
	public Empregado(String cpf, int idade, double salario) {
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return "Empregado [cpf=" + cpf + ", idade=" + idade + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Object outroEmpregado) {
		if (this.idade < ((Empregado) outroEmpregado).getIdade()) {
            return -1;
        }
        if (this.idade > ((Empregado) outroEmpregado).getIdade()) {
            return 1;
        }
        return 0;
	}
}

