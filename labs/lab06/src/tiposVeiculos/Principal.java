package tiposVeiculos;

public class Principal {
	public static void main(String[] args) {
		
		Veiculo vetVeic[] = new Veiculo[5];
		int indVermelho=0;
		
		vetVeic[0] = new Carro("Hyundai", "Creta", "Vermelho", 1000);
		vetVeic[1] = new Moto("Honda", "Street", "Amarelo", 500);
		vetVeic[2] = new Carro("Fiat", "Palio", "Cinza", 5000);
		vetVeic[3] = new Moto("Hyundai", "Scooter", "Vermelho", 2000);
		vetVeic[4] = new Carro("Audi", "Q4", "Azul", 1500);
		
		for(int i=0; i<vetVeic.length; i++) {
			
			if(vetVeic[i].cor().equalsIgnoreCase("Vermelho")) {
				indVermelho=i;
			}
		}
		
	}
}
