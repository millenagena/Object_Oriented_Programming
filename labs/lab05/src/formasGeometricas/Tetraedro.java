package formasGeometricas;

public class Tetraedro extends FormaTridimensional {
	private double base;
	private double alturaBase;
	private double altura;
	
	public Tetraedro(String cor, int x, int y, int z, double base, double alturaBase, double altura) {
		super(cor, x, y, z);
		this.base = base;
		this.alturaBase = alturaBase;
		this.altura = altura;
	}
	
	@Override
	public double obterVolume() {
		return (1/3)*(base*alturaBase)*altura;
	}
}
