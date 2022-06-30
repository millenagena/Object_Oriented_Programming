package formasGeometricas;

public class FormaTridimensional extends Forma {
	private int x;
	private int y;
	private int z;
	
	public FormaTridimensional(String cor, int x, int y, int z) {
		super(cor);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double obterVolume() {
		return 0;
	}
}
