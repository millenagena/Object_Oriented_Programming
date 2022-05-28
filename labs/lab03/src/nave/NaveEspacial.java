package nave;

import java.util.Random;

public class NaveEspacial {
	private String nome;
	private int velocidade;
	
	public NaveEspacial(String s) {
		
		Random aleatorio = new Random();
		this.nome = s;
		this.velocidade = aleatorio.nextInt((10 - 5) + 1) + 5;
	}
	
	public NaveEspacial(String s, int v) {
		this.nome = s;
		this.velocidade = v;
	}
	
	public void mostrarNave() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("Velocidade: " + this.velocidade);
		if(this.velocidade == 0) {
			System.out.println("-- NAVE INOPERANTE --");
		}
	}
	
	public void naveMaisRapida(NaveEspacial n) {
		if(this.velocidade > n.getVelocidade()) {
			System.out.println("\nA nave mais veloz é a: ");
			this.mostrarNave();
		}else if(n.getVelocidade() > this.velocidade){
			System.out.println("\nA nave mais veloz é a: ");
			n.mostrarNave();
		}else {
			System.out.println("\nAs duas naves possuem mesma velocidade!");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
}
