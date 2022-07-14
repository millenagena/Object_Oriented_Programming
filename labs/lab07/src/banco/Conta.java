package banco;

public class Conta {
	private String nome;
	private double saldo;
	private int numero;
	
	public Conta(String nome, double saldo, int numero) throws SaldoException {
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
		if ((this.nome == null) || (this.nome.isEmpty())) {
			throw new NullPointerException("O nome nao pode ser nulo!");
		}
		if(this.saldo < 50) {
			throw new SaldoException("O saldo deve ser no minimo 50 reais "
					                 + "para criar uma nova conta!");
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void saca(double valor) throws SaldoException {
		if(valor > (this.saldo-50)) {
			throw new SaldoException("SALDO INSUFICIENTE!");
		}else {
			System.out.println("Saldo anterior: " + this.saldo);
			this.saldo -= valor;
			System.out.println("Valor sacado: " + valor);
			System.out.println("Saldo atual: " + this.saldo);
		}
	}
	
	public void deposita(double valor) throws SaldoException {
		if(valor < 0) {
			throw new SaldoException("Valor invalido!");
		}
		System.out.println("Saldo anterior: " + this.saldo);
		this.saldo += valor;
		System.out.println("Valor depositado: " + valor);
		System.out.println("Saldo atual: " + this.saldo);
	}
	
	@Override
	public String toString() {
		return "\n===Dados da conta:===" +
				"\nNome: " + this.nome + 
				"\nSaldo: " + this.saldo + 
				"\nNum. conta: " + this.numero;
	}
	
	
}
