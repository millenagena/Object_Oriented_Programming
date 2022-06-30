package formasGeometricas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op, contDvd=0, contCd=0, contVhs=0, 
			anoProd, tempoDuracao, classiEtaria,
			numAtores, numFaixas, tipoMid;
		float precoLoc;
		Boolean reb;
		String nome, genero, diretor, nomeCantor;
		String[] nomeAtores = new String[10];
		
		do {
			
			System.out.println("\n===== MENU =====");
			System.out.println("1 - Cadastrar um DVD");
			System.out.println("2 - Cadastrar um CD");
			System.out.println("3 - Cadastrar uma Fita VHS");
			System.out.println("4 - Procurar mídia");
			System.out.println("5 - Procurar mídia");
			System.out.println("6 - Sair");
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
			}
			
		}while(op != 6);
		sc.close();
	}

}

