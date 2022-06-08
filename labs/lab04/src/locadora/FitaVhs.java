package locadora;

public class FitaVhs extends Dvd{
	private Boolean rebobinada;

	public FitaVhs(String nome, String genero, int anoProducao, float precoLocacao, 
				   String[] nomeAtores, String diretor, int tempoDuracao, 
				   int classiEtaria, Boolean rebobinada) {
		
		super(nome, genero, anoProducao, precoLocacao, nomeAtores, diretor, tempoDuracao, classiEtaria);
		this.rebobinada = rebobinada;
	}

	public Boolean getRebobinada() {
		return rebobinada;
	}
	
	public String getDados() {
		return super.getDados() + "FitaVhs [rebobinada=" + rebobinada + "]";
	}
}
