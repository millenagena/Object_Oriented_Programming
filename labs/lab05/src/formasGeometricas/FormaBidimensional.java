package formasGeometricas;

public class FormaBidimensional extends Forma {
	private int x;
	private int y;
	
	public FormaBidimensional(String cor, int x, int y) {
		super(cor);
		this.x = x;
		this.y = y;
	}
	
	public double obterArea() {
		return 0;
	}
}


