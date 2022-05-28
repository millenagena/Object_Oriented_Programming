package nave;

import java.util.Scanner;

public class AmbienteEspacial {
	public static void main(String[] args) {
		
		NaveEspacial[] naves = new NaveEspacial[5];
		Scanner sc = new Scanner(System.in);
		int op, contNaves = 0;
		
		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1 - Criar uma nave");
			System.out.println("2 - Mostrar naves existentes");
			System.out.println("3 - Comparar velocidade de duas naves");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					if(contNaves <= 2) {
						System.out.print("\nInforme o nome da nave: ");
						String nome = sc.next();
						NaveEspacial nave = new NaveEspacial(nome);
						naves[contNaves] = nave;
						contNaves++;
					}else if(contNaves > 2 && contNaves <= 4) {
						System.out.println("\n-- SUPERPOPULAÇÃO DE NAVES --");
						NaveEspacial nave = new NaveEspacial("Nave com defeito", 0);
						naves[contNaves] = nave;
						contNaves++;
					}else {
						System.out.println("\n-- NÚMERO MAX DE NAVES EXCEDIDO --");
					}
					break;
				case 2:
					for(int i=0; i < contNaves; i++) {
						naves[i].mostrarNave();
					}
					break;
				case 3:
					System.out.println("\nInforme o nome da nave 1: ");
					String nome1 = sc.next();
					System.out.println("Informe o nome da nave 2: ");
					String nome2 = sc.next();
					
					int ind1 = 0, ind2 = 0;
					for(int i=0; i < contNaves; i++) {
						if(naves[i].getNome().equalsIgnoreCase(nome1)) {
							ind1 = i;
						}else if(naves[i].getNome().equalsIgnoreCase(nome2)) {
							ind2 = i;
						}
					}
					naves[ind1].naveMaisRapida(naves[ind2]);	
			}
			
		}while(op != 4);
		sc.close();
	}
}
