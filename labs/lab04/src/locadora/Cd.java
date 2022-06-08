package locadora;

public class Cd extends Midia{
	private String cantor;
	private int numFaixas;
	
	public Cd(String nome, String genero, int anoProducao, 
			float precoLocacao, String cantor, int numFaixas) {
		
		super(nome, "audio", genero, anoProducao, precoLocacao);
		this.cantor = cantor;
		this.numFaixas = numFaixas;
	}
	
	public String getCantor() {
		return cantor;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public String getDados() {
		return super.getDados() + "Cd [cantor=" + cantor + ", numFaixas=" + numFaixas + "]";
	}
	
	
}
