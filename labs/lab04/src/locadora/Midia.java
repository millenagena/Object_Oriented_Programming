package locadora;

public class Midia {
	private String nome;
	private String tipo;
	private String genero;
	private int anoProducao;
	private float precoLocacao;
	
	public Midia(String nome, String tipo, String genero, int anoProducao, float precoLocacao) {
		this.nome = nome;
		this.tipo = tipo;
		this.genero = genero;
		this.anoProducao = anoProducao;
		this.precoLocacao = precoLocacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAnoProducao() {
		return anoProducao;
	}
	public void setAnoProducao(int anoProducao) {
		this.anoProducao = anoProducao;
	}
	public float getPrecoLocacao() {
		return precoLocacao;
	}
	public void setPrecoLocacao(float precoLocacao) {
		this.precoLocacao = precoLocacao;
	}

	public String getDados() {
		return "Midia [nome=" + this.nome + ", tipo=" + this.tipo + ", genero=" + this.genero + ", anoProducao=" + this.anoProducao
				+ ", precoLocacao=" + this.precoLocacao + "] ";
	}
}
