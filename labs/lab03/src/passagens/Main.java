package passagens;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o preco da passagem: ");
		int valor = sc.nextInt();

		MaquinaPassagens mp = new MaquinaPassagens(valor);
        
		int op = -1;
		
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Mostrar valor da passagem");
            System.out.println("2 - Comprar passagem");
            System.out.println("3 - Consultar total inserido");
            System.out.println("4 - Sair");
            op = sc.nextInt();
           
            switch(op) {
            	case 1:
            		System.out.println("O valor da passagem eh: R$" + mp.getPreco());
                    break;
            	case 2:
            		System.out.println("Insira moedas de R$1 ou notas de R$2: ");
            		int dinheiro = sc.nextInt();
            		mp.insereDinheiro(dinheiro);
            		break;
            	case 3:
            		System.out.println("Valor total já inserido: R$" + mp.getTotal());
            		break;
            }
        } while(op != 4);
        sc.close();
	}
}
