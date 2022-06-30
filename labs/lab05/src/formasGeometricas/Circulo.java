package formasGeometricas;

public class Circulo extends FormaBidimensional {
	private double raio;

	public Circulo(String cor, int x, int y, double raio) {
		super(cor, x, y);
		this.raio = raio;
	}
	
	@Override
	public double obterArea() {
		return Math.pow(this.raio, 2)*Math.PI;
	}
	
	public double intercepta(Circulo circ){
		return 1;
	}
}
