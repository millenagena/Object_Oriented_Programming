package formasGeometricas;

public class Triangulo extends FormaBidimensional {
	private double base;
	private double altura;
	
	public Triangulo(String cor, int x, int y, double base, double altura) {
		super(cor, x, y);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double obterArea() {
		return (this.base*this.altura);
	}
	
}
