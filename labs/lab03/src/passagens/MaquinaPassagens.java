package passagens;

public class MaquinaPassagens {
	private int preco;
	private int qntdInserida;
	private int total;
	
	public MaquinaPassagens(int p) {
		this.preco = p;
		this.qntdInserida = 0;
		this.total = 0;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getQntdInserida() {
		return qntdInserida;
	}

	public void setQntdInserida(int qntdInserida) {
		this.qntdInserida = qntdInserida;
	}

	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void insereDinheiro(int valor) {
		this.qntdInserida += valor;
		this.total += valor;
		
		if(this.qntdInserida < this.preco) {
			System.out.println("Você inseriu: R$" + this.qntdInserida);
			System.out.println("Faltam R$" + (this.preco - this.qntdInserida) + " para completar o valor da passagem");
		}else if(this.qntdInserida >= preco) {
			emitePassagem();
			int troco = this.qntdInserida - preco;
			if(troco > 0) {
				System.out.println("Troco: " + troco);
				this.total -= troco;
				this.qntdInserida = 0;
			}
		}
	}
	
	public void emitePassagem() {
		System.out.println("\nPassagem emitida com sucesso!");
	}
	
}
