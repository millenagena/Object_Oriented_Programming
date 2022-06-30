package formasGeometricas;

public class Quadrado extends FormaBidimensional {
	private double lado;

	public Quadrado(String cor, int x, int y, double lado) {
		super(cor, x, y);
		this.lado = lado;
	}
	
	@Override
	public double obterArea() {
		return (this.lado * this.lado);
	}
}
