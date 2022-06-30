package formasGeometricas;

public class Esfera extends FormaTridimensional {
	private double raio;

	public Esfera(String cor, int x, int y, int z, double raio) {
		super(cor, x, y, z);
		this.raio = raio;
	}
	
	@Override
	public double obterVolume() {
		return (4/3)*Math.PI*(Math.pow(this.raio, 3));
	}
}
