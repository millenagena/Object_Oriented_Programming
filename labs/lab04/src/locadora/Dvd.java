package locadora;

import java.util.Arrays;

public class Dvd extends Midia{
	private String[] nomeAtores = new String[10];
	private String diretor;
	private int tempoDuracao;
	private int classiEtaria;
	
	public Dvd(String nome, String genero, int anoProducao, 
			float precoLocacao, String[] nomeAtores,
			String diretor, int tempoDuracao, int classiEtaria) {
		
		super(nome, "video", genero, anoProducao, precoLocacao);
		this.nomeAtores = nomeAtores;
		this.diretor = diretor;
		this.tempoDuracao = tempoDuracao;
		this.classiEtaria = classiEtaria;
	}

	public String[] getNomeAtores() {
		return nomeAtores;
	}

	public String getDiretor() {
		return diretor;
	}

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public int getClassiEtaria() {
		return classiEtaria;
	}

	public String getDados() {
		return super.getDados() + "Dvd [nomeAtores=" + Arrays.toString(nomeAtores) + ", diretor=" + diretor + ", tempoDuracao="
				+ tempoDuracao + ", classiEtaria=" + classiEtaria + "]";
	}
}
