package formasGeometricas;

public class Cubo extends FormaTridimensional {
	private double lado;

	public Cubo(String cor, int x, int y, int z, double lado) {
		super(cor, x, y, z);
		this.lado = lado;
	}
	
	@Override
	public double obterVolume() {
		return Math.pow(this.lado, 3);
	}
}
