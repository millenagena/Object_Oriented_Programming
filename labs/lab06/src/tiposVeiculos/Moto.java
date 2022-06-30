package tiposVeiculos;

public class Moto implements Veiculo {

	private String marca;
	private String modelo;
	private String cor;
	private double potencia;
	
	public Moto(String marca, String modelo, String cor, double potencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.potencia = potencia;
	}

	@Override
	public String marca() {
		return this.marca;
	}

	@Override
	public String modelo() {
		return this.modelo;
	}

	@Override
	public String cor() {
		return this.cor;
	}

	@Override
	public double potencia() {
		return this.potencia*10;
	}

	@Override
	public void mostraDados() {
		System.out.println("\nMarca: " + this.marca + 
						   "\nModelo: " + this.modelo + 
						   "\nCor: " + this.cor + 
						   "\nPotencia: " + this.potencia);
	}

}
